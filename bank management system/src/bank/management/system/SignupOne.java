
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;//random
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
//random is used to generate a random number
//Maths.abs  converts a negative to positive
public class SignupOne extends JFrame implements ActionListener
{
    long random;
     JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,stateTextField,cityTextField,pincodeTextField;
     JButton next;
     JRadioButton male,female, married, unmarried,other;
     JDateChooser dateChooser;
     SignupOne()
    {
       setLayout(null);
       Random ran= new Random();
       random=Math.abs((ran.nextLong()%9000L)+1000L);
       
       JLabel formno =new JLabel("APPLICATION FORM NO. "+random);
       formno.setFont(new Font("Raleway",Font.BOLD,38));
       formno.setBounds(140, 20, 600, 40);
       add(formno);
       
       JLabel personDetails =new JLabel("Page1: Personal Details");
       personDetails.setFont(new Font("Raleway",Font.BOLD,20));
       personDetails.setBounds(290, 80, 400, 30);
       add(personDetails);
       
       JLabel name =new JLabel("Name:");
       name.setFont(new Font("Raleway",Font.BOLD,22));
       name.setBounds(100, 140, 100, 30);
       add(name);
       
       nameTextField= new JTextField();
       nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       nameTextField.setBounds(300, 140, 400, 30);
       add(nameTextField);
       
       JLabel fname =new JLabel("Father's Name:");
       fname.setFont(new Font("Raleway",Font.BOLD,20));
       fname.setBounds(100, 190, 200, 30);
       add(fname);
       
       fnameTextField= new JTextField();
       fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       fnameTextField.setBounds(300, 190, 400, 30);
       add(fnameTextField);
       
       JLabel dob =new JLabel("Date Of Birth:");
       dob.setFont(new Font("Raleway",Font.BOLD,20));
       dob.setBounds(100, 240, 200, 30);
       add(dob);
       
       dateChooser= new JDateChooser();
       dateChooser.setBounds(300,240,400,30);
       dateChooser.setForeground(new Color(105,105,105));
       add(dateChooser);
               
               
               
               
       JLabel gender =new JLabel("Gender:");
       gender.setFont(new Font("Raleway",Font.BOLD,20));
       gender.setBounds(100, 290, 200, 30);
       add(gender);
       
       
       male= new JRadioButton("Male");
       male.setBounds(300,290,60,30);
       male.setBackground(Color.white);
       add(male);
               
       female = new JRadioButton("Female");  
       female.setBounds(450, 290, 120, 30);
       female.setBackground(Color.white);
       add(female);
       
       other =new JRadioButton("Other");
       other.setBounds(630,290,180,30);
       other.setBackground(Color.white);
       add(other);
       
       
       ButtonGroup genderGroup= new ButtonGroup();//for choosing one out of two butttons
       genderGroup.add(male);
       genderGroup.add(female);
       genderGroup.add(other)
       
       
       
       JLabel email =new JLabel("Email Address");
       email.setFont(new Font("Raleway",Font.BOLD,20));
       email.setBounds(100, 340, 200, 30);
       add(email);
       
       emailTextField= new JTextField();
       emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
       emailTextField.setBounds(300, 340, 400, 30);
       add(emailTextField);
       
       JLabel marital =new JLabel("Marital Status:");
       marital.setFont(new Font("Raleway",Font.BOLD,20));
       marital.setBounds(100, 390, 200, 30);
       add(marital);
       
       
       married= new JRadioButton("Married");
       married.setBounds(300,390,100,30);
       married.setBackground(Color.white);
       add(married);
       
       unmarried= new JRadioButton("Unmarried");
       unmarried.setBounds(450,390,100,30);
       unmarried.setBackground(Color.white);
       add(unmarried);
       
       
       
       
       ButtonGroup martialGroup= new ButtonGroup();//for choosing one out of two butttons
       martialGroup.add(married);
       martialGroup.add(unmarried);
    
       
       
       
       
       
       JLabel address =new JLabel("Adress:");
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100, 440, 200, 30);
       add(address);
       
       addressTextField= new JTextField();
       addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
       addressTextField.setBounds(300, 440, 400, 30);
       add(addressTextField);
       
       JLabel city =new JLabel("City");
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100, 490, 200, 30);
       add(city);
       
       cityTextField= new JTextField();
       cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
       cityTextField.setBounds(300, 490, 400, 30);
       add(cityTextField);
       
       JLabel state =new JLabel("State");
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds(100, 540, 200, 30);
       add(state);
       
       stateTextField= new JTextField();
       stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
       stateTextField.setBounds(300, 540, 400, 30);
       add(stateTextField);
       
       
       JLabel pincode =new JLabel("Pin Code");
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100, 590, 200, 30);
       add(pincode);
       
       pincodeTextField= new JTextField();
       pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
       pincodeTextField.setBounds(300, 590, 400, 30);
       add(pincodeTextField);
       
       
       JButton next = new JButton("NEXT");
       next.setBackground(Color.black);
       next.setForeground(Color.white);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620, 660, 80, 30);
       next.addActionListener(this);
       add(next);
       
       
       
       
       
       
       
       getContentPane().setBackground(Color.WHITE);
       
       setSize(850,800);
       setLocation(350,10);
       setVisible(true);//for the java frame to be visible
    }
     
     public void actionPerformed(ActionEvent ae)
     {
         String formno=""+random;//converting long to string
         String name=nameTextField.getText();
         String fname=fnameTextField.getText();
         String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//getUicomponent returns Textfield
         String gender= null;
         if(male.isSelected())
         {
             gender="Male";
         }
         else if(female.isSelected())
                 {
                     gender="female";
                 }
         String email=emailTextField.getText();
         String martial=null;
         if(married.isSelected())
         {
             martial="Married";
         }
         else if(unmarried.isSelected())
         {
             martial="Unmarried";
         }
         else if(other.isSelected())
         {
             martial="Other";
         }
         
         String address=addressTextField.getText();
         String city=cityTextField.getText();
         String state=stateTextField.getText();
         String pin=pincodeTextField.getText();
         
         
         try
         {
             if(name.equals(""))
                     {
                         JOptionPane.showMessageDialog(null, "Name is required");//JOptionPane is used tO dispaly a pop up or Dailogue
                     }
             else
             {
                 Conn c= new Conn();
                 String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new SignupTwo(formno).setVisible(true);
             }
             
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
     
     
    public static void main(String[] args)
    {
        new SignupOne();
    }
    
}
