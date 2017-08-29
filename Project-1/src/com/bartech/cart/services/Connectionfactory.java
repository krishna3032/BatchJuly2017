package com.bartech.cart.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class Connectionfactory {
	
	private static Connection con = null;
	public static Connection getConnection() {
		
	
		if(con==null) 
		{
			try {
				ResourceBundle bundle=ResourceBundle.getBundle("db");
				String driver = bundle.getString("driverClass");
				String url=bundle.getString("url");
				String username=bundle.getString("username");
				String pwd=bundle.getString("password");
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,pwd);
			}catch(Exception e)
			{
			}
			
		}
		return con;
	}
	

}
