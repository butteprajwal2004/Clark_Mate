/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Prajwal
 */
public class db_connection {
   
    
    public static Connection getconnection(){
        Connection   con = null;
    try{
            Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_collageaddmittion_system","root","");
            if (con!= null){
            
                System.out.println("connected");
            }  
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error : "+e);
 }
        return con;
        }
    
    public static PreparedStatement preStateMent(String sql) throws SQLException, ClassNotFoundException {
        return getconnection().prepareStatement(sql);
    }
    public static void main(String[] args) {
        getconnection();
    }

}
    
    

