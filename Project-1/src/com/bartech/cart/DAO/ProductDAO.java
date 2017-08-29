package com.bartech.cart.DAO;

import com.bartech.cart.models.Product;
import com.bartech.cart.services.ProductServices;

public class ProductDAO {

	public static void main(String[] args) throws Exception{
		ProductServices pds= new ProductServices();
		
		Product pd=new Product(111,asus,zenphone,zenfive,9874,4586,12,20-jul-2015,sri,5-jul-2015,sri,y);
		pds.insert(pd);

	}

}
