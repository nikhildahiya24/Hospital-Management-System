
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Harsh
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","harsh");  
           return con;
        }
        catch(ClassNotFoundException | SQLException e){

        return null;
        }      
        
    }
    
}
