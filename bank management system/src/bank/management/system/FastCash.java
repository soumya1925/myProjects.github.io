package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener
{
    JButton d1,d2,d3,d4,d5,d6,back;
    String pinnumber;
    FastCash(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text= new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);// if only add(text) theb text is not visible as it is added on the frame to get text on the image
        
        d1= new JButton("Rs 100");
        d1.setBounds(170, 415, 150, 30);
        d1.addActionListener(this);
        image.add(d1);//deposit is displayed over the image
        
           
        d2= new JButton("Rs 500");
        d2.setBounds(355, 415, 150, 30);
        d2.addActionListener(this);
        image.add(d2);
        
        d3= new JButton("Rs 1000");
        d3.setBounds(170,450, 150, 30);
        d3.addActionListener(this);
        image.add(d3);
        
        d4= new JButton("Rs 2000");
        d4.setBounds(355, 450, 150, 30);
        d4.addActionListener(this);
        image.add(d4);
        
        d5= new JButton("Rs 5000");
        d5.setBounds(170,485, 150, 30);
        d5.addActionListener(this);
        image.add(d5);
        
        d6= new JButton("Rs 10000");
        d6.setBounds(355,485, 150, 30);
        d6.addActionListener(this);
        image.add(d6);
        
        back= new JButton("BACK");
        back.setBounds(355,520,150, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);//if it set true the top white colour space by deafault will be removed 
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        
        else 
        {
            String amount=((JButton)ae.getSource()).getText().substring(3);//1st 3 characters of textField is not picked  
            Conn c= new Conn();
            try
            {
                ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance=0;
                while(rs.next())//for picking rows in the table
                        {
                            if(rs.getString("type").equals("Deposit"))
                                balance+= Integer.parseInt(rs.getString("amount"));//Integer.parseInt method is used to convert to integer
                            else
                                balance -=Integer.parseInt(rs.getString("amount"));
                        }
                if(ae.getSource()!=back&&balance< Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date=new Date();//Date class is present in both sql and util package hence compiler become ambigious which date to import
                //Hence import java.util.Date is nesessary
                String  query="insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Sucessfully");
                 
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println(e);
                new Transactions(pinnumber).setVisible(true);
            }
          
        }
        
    }
    public static void main(String[] args) 
    {
      new FastCash("");
    }
}
