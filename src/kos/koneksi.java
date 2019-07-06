/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class koneksi {
public static Connection connect;  
 

private static Statement stmt;
 private static String driverName = "oracle.jdbc.driver.OracleDriver";  
 private static String jdbc = "jdbc:oracle:thin:";  
 private static String host = "@localhost:";  
 private static String port = "49672:";  
 private static String SID = "xe";   
 private static String database = "kos";   
 private static String url = jdbc + host + port + SID;  
 private static String username = "kos";   
 private static String password = "Asus2018";  
 public static Connection getConnection() throws SQLException {  
   if (connect == null) {  
    try {  
      Class.forName(driverName);  
      System.out.println("Class Driver Ditemukan");  
      try {  
       connect = DriverManager.getConnection(url, username, password);  
       System.out.println("Koneksi Database Sukses");  
      } catch (SQLException se) {  
       System.out.println("Koneksi Database Gagal : " + se);  
       System.exit(0);  
      }  
    } catch (Exception e) {  
      JOptionPane.showMessageDialog(null, "Error Cok :"+e.getMessage());
        System.exit(0);  
    }  
   }  
   return connect;  
 }  
}