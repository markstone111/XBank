/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    Connection con=null;
    Statement stmt;
    ResultSet rs=null;
	
    Database()
    {
	try
	{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.1.41:1521/xepdb1", "system", "1234");
            stmt=con.createStatement();		
	}
	catch (Exception e)
	{
            e.printStackTrace();
	}
    }
}

