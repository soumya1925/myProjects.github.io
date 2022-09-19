
package bank.management.system;


//JDBC creating connection

import java.sql.*;
public class Conn 
{
    Connection c;
    Statement s;
    public Conn()
    {
        try
        {
          //Class.forName(com.mysql.cj.jdbc.Driver); no need to register driver after import  my sql coonector jar file
          c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Codeforyou");
          s=c.createStatement();
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
    
}
