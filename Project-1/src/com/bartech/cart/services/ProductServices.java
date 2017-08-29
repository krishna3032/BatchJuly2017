package com.bartech.cart.services;

import java.sql.Connection;
import java.sql.Statement;
import com.bartech.cart.models.Product;


public class ProductServices {
	public static Connection con=null;
	public static Statement st=null;
	
	public ProductServices() throws Exception{
		con=Connectionfactory.getConnection();
		st=con.createStatement();
		}

	public void insert(Product pd) throws Exception{
		String sql="insert into srikanth values("+pd.getId()+",'"+pd.getManufacturer()+"','"+pd.getName()+"',"
				+ "'"+pd.getDescription()+"',"+ pd.getEAN()+","+ pd.getGTIN()+","+pd.getUOM()+","+ pd.getCreatedTime()+""
				+ ",'"+ pd.getCreatedBy()+"',"+pd.getUpdatedTime()+",'"+pd.getUpdatedBy()+"','"+pd.getIsActive()+"')";
		int n=st.executeUpdate(sql);
		if(n>0)
			System.out.println("Details of the student are saved");
		System.out.println("Details of the student are saved again");

	}

}
