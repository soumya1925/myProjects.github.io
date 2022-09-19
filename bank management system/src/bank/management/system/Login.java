
package bank.management.system;
//JFrame present in swing packkage
//setSize() function is used to define the dimensions of the frame
//Layout is set to naull so that image is not dragged to the centre even after decalring setbounds
//JLabel is used to set the image
//JLabel is also used to write the contents in the frame
//JTextField is used for a box for user input
//Jbutton for buttons 
//***ver imp ActionListener inteface Invoked when an action occurs prresent in java.awt.event
//abstract method is present in actionListener interface
//ActioListener method is called to catch the button event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener
{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    //JPasswordField is used to hide the content 
    //global are declared so it can be acessed outside constructor 
    //and can be overrided in the abstract method of  ActionListener Interface
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100 ,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text= new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        
        JLabel cardno= new JLabel("CARD No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        cardTextField= new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        JLabel pin= new JLabel("PIN:");
        pin.setFont(new Font("Onsward",Font.BOLD,28));
        pin.setBounds(120, 220, 400, 40);
        add(pin);
        
        pinTextField= new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));//Text Size
        add(pinTextField);
        
        login= new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear= new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup= new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
    
            
        
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);// to set the dimension when the ouptprut screen appears
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login)
        {
            Conn conn= new Conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();// getText() function has become invalid for password field
            String query="select * from login where cardnumber= '"+cardnumber+"'and pin='"+pinnumber+"'";// here thecardnumber in balck is the data present in server
            //and is matched to the entered data i.e the the variable//
            try
            {
                ResultSet rs=conn.s.executeQuery(query);
                if(rs.next())   //if rs has some data then the user
                {
                    setVisible(false);//login frame is closed
                    new Transactions(pinnumber).setVisible(true);//transfaction frame is opened and pinnumber is passed to transaction
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception e)
                    {
                        System.out.println(e);
                    }
            
        }
        else if(ae.getSource()==signup)
        {
            setVisible(false);
            new SignupOne().setVisible(true);// if visible is true a sign up object is created so that after sign up button is pressed  in login frame automatically signup frame loads
        }
    }
    public static void main(String[] args) 
    {
        new Login();
    }
}
