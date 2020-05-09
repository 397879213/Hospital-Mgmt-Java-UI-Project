/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsm;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class HSM 
{
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    DefaultTableModel model=null;
    public HSM() 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","arianemunr0");
            System.out.println("connect");
            
            
        }
    catch(Exception ex)
    {}
        
    }
                         

    public static void main(String args[]) 
    {
      HSM h=new HSM();
      First f1=new First();
      f1.setVisible(true);
    }                  

}
