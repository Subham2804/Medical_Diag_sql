
package db_conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Medical_Diagnosis {

     public static Connection connect() 
    {
     Connection conn=null;
     try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("driver loaded");
      conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical","root","Subham@8991");
      System.out.println("Connection Successful");
      
     }
     catch(ClassNotFoundException | SQLException e){
       System.out.println("Connection Failed");
      }
        return conn;
    }
}
