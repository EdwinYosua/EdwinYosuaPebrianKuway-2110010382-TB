/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ppdbkalsel;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

/**
 *
 * @author Edwin Yosua<2110010382>
 */
public class MysqlKonek {
    static Connection MysqlKonek = null;
    public static Connection koneksiDb()    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            MysqlKonek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbpendaftaran","root","");
            return MysqlKonek;
        } catch (Exception e)   {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
