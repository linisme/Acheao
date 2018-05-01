package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestJDCB {
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		Class.forName("org.gjt.mm.mysql.Driver");
		String URL = "jdbc:mysql://localhost:3306/mysqltest";
		Connection con = DriverManager.getConnection(URL, "root", "12358");
		Statement sata = con.createStatement();
		ResultSet rs = sata.executeQuery("select * from orders"); 
		   
		while(rs.next()){
			System.out.println(rs.getString("order_date"));
		}
		rs.close();
		sata.close();
		con.close();
		
	} 

}
