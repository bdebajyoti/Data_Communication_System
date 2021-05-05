
package data_communication_system;
import java.sql.*;
import javax.swing.JOptionPane;
public class DCS {
    Connection conn;
     public static Connection Connect()
     {
         String sql="com.mysql.jdbc.Driver";
         try
         {
             Class.forName(sql);
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dcs","root","");
             return conn;
         }
         catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null,ex);
             return null;
         }
}
}
