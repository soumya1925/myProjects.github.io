package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//random
//random is used to generate a random number
//Maths.abs  converts a negative to positive
public class SignupTwo extends JFrame implements ActionListener
{
   
     JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
     JTextField pan,aadhar;
     JButton next;
     JRadioButton syes,sno, eyes, eno;
     JComboBox religion,category,occupation,education,income;
     String formno;
     SignupTwo(String formno)
    {
       this.formno=formno;
       setLayout(null);
       
       setTitle("NEW ACCOUNT APPLICATION FORM-PAGE-2");
       
       
       JLabel additionalDetails =new JLabel("Page2: Additional Details");
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
       additionalDetails.setBounds(290, 80, 400, 30);
       add(additionalDetails);
       
       
       l1 =new JLabel("Religion");
       l1.setFont(new Font("Raleway",Font.BOLD,22));
       l1.setBounds(100, 140, 100, 30);
       add(l1);
       
       String valReligion[]={"Hindu","Muslim","Christian","Sikh","other"};
       religion = new JComboBox(valReligion);
       religion.setBounds(300, 140, 400, 30);
       religion.setBackground(Color.white);
       add(religion);
       
      
       l2 =new JLabel("Category:");
       l2.setFont(new Font("Raleway",Font.BOLD,20));
       l2.setBounds(100, 190, 200, 30);
       add(l2);
       
       String valCategory[]={"General","OBC","SC","ST","Other"};
       category= new JComboBox(valCategory);
       category.setBounds(300, 190, 400, 30);
       category.setBackground(Color.white);
       add(category);
       
       l3  =new JLabel("Income:");
       l3.setFont(new Font("Raleway",Font.BOLD,20));
       l3.setBounds(100, 240, 200, 30);
       add(l3);
       
       
       String incomeCategory[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000"};
       income= new JComboBox(incomeCategory);
       income.setBounds(300, 240, 400, 30);
       income.setBackground(Color.white);
       add(income);
               
               
               
       l4 =new JLabel("Educational:");
       l4.setFont(new Font("Raleway",Font.BOLD,20));
       l4.setBounds(100, 290, 200, 30);
       add(l4);
       

       
       
       
       l5 =new JLabel("Qualifcation");
       l5.setFont(new Font("Raleway",Font.BOLD,20));
       l5.setBounds(100, 315, 200, 30);
       add(l5);
       
       String educationValue[]={"Non Graduation","Graduate","Post Graduation","Doctorate","Other"};
       education= new JComboBox(educationValue);
       education.setBounds(300, 315, 400, 30);
       education.setBackground(Color.white);
       add(education);
           
       
       l6 =new JLabel("Occupation:");
       l6.setFont(new Font("Raleway",Font.BOLD,20));
       l6.setBounds(100, 390, 200, 30);
       add(l6);
       
       
       String occupationValue[]={"Salarised","Self Employed","Buisness","Buisness","Retired"};
       occupation = new JComboBox(occupationValue);
       occupation.setBounds(300, 390, 400, 30);
       occupation.setBackground(Color.white);
       add(occupation);
       
       
       l7  =new JLabel("PAN Number:");
       l7.setFont(new Font("Raleway",Font.BOLD,20));
       l7.setBounds(100, 440, 200, 30);
       add(l7);
       
       pan= new JTextField();
       pan.setFont(new Font("Raleway",Font.BOLD,14));
       pan.setBounds(300, 440, 400, 30);
       add(pan);
       
       l8  =new JLabel("Aadhar Number");
       l8.setFont(new Font("Raleway",Font.BOLD,20));
       l8.setBounds(100, 490, 200, 30);
       add(l8);
       
       aadhar= new JTextField();
       aadhar.setFont(new Font("Raleway",Font.BOLD,14));
       aadhar.setBounds(300, 490, 400, 30);
       add(aadhar);
       
       l9  =new JLabel("Senior Citizen");
       l9.setFont(new Font("Raleway",Font.BOLD,20));
       l9.setBounds(100, 540, 200, 30);
       add(l9);
       
       
       syes= new JRadioButton("Yes");
       syes.setBounds(300,540,100,30);
       syes.setBackground(Color.white);
       add(syes);
       
       sno= new JRadioButton("NO");
       sno.setBounds(450,540,100,30);
       sno.setBackground(Color.white);
       add(sno);
       
       ButtonGroup martialGroup= new ButtonGroup();//for choosing one out of two butttons
       martialGroup.add(syes);
       martialGroup.add(sno);
       
      
       
       
       l10  =new JLabel("Existing Acxount");
       l10.setFont(new Font("Raleway",Font.BOLD,20));
       l10.setBounds(100, 590, 200, 30);
       add(l10);
       
       eyes= new JRadioButton("Yes");
       eyes.setBounds(300,590,100,30);
       eyes.setBackground(Color.white);
       add(eyes);
       
       eno= new JRadioButton("NO");
       eno.setBounds(450,590,100,30);
       eno.setBackground(Color.white);
       add(eno);
       
       ButtonGroup emartialGroup= new ButtonGroup();//for choosing one out of two butttons
       emartialGroup.add(eyes);
       emartialGroup.add(eno);
       
       
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
        
         String sreligion=(String)religion.getSelectedItem();//getselectedItem is used to select one out of many items from dropdown
         String scategory=(String)religion.getSelectedItem();// getselectedItem returns an object hence it is typecasted to string
         String sincome=(String)income.getSelectedItem();
         String seducation=(String)education.getSelectedItem();
         String soccupation=(String)occupation.getSelectedItem();
         String seniorcitizen=null;
         if(syes.isSelected())
             seniorcitizen="Yes";
         else if(sno.isSelected())
             seniorcitizen="No";
         
          String existingaccount=null;
         if(eyes.isSelected())
             existingaccount="Yes";
         else if(eno.isSelected())
             existingaccount="No";
         
         
         
         
         String span=pan.getText();
         String saadhar=aadhar.getText();
   
         try
         {
            
                 Conn c= new Conn();
                 String query = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);//formno need to be passed from signupTwo to signupThree
          
             
         }
         //Signup3
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
     
     
    public static void main(String[] args)
    {
        new SignupTwo("");
    }
    
}
