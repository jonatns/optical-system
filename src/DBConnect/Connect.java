/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    Connection con = null;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistemaoptica", "root", "yourpasswordhere");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error " +e);
        }
        return con;   
    }   
}
