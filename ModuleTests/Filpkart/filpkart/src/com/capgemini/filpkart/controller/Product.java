package com.capgemini.filpkart.controller;

import java.util.Scanner;

import com.capgemini.filpkart.bean.ProductBean;
import com.capgemini.filpkart.factory.ProductFactory;
import com.capgemini.filpkart.services.ProductServices;

public class Product {
	public static void main(String[] args) {
		ProductServices service=ProductFactory.instanceOfProductServicesImpl();
		ProductBean c=new ProductBean();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Press 1 to Insert Product Details");
			System.out.println("Press 2 to Search Product Details");
			
			System.out.println("Press 3 to Get All Product Details");
			System.out.println("Press 4 For Home");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
				    System.out.println("Enter the Product ID");
				    int id=sc.nextInt();
				   
				    System.out.println("Enter the Product Name");
				    String name=sc.next();
				    System.out.println("Enter the Product Cost");
				    int cost=sc.nextInt();
				    System.out.println("Enter the Product Color");
				    String color=sc.next();
				    System.out.println("Enter the Product Description");
				    String desc=sc.next(); 
				   
				    c.setPid(id);
				    c.setPname(name);
				    c.setPCost(cost);
				    c.setColor(color);
				    c.setPdesc(desc);
				   
				   
				    boolean check=service.addProduct(c);
				    if(check)
				    {
				    	System.out.println("Product Added Successfully");
				    }
				    else
				    {
				    	System.out.println("Product Not Added");
				    }
				    break;
		
	}
		
		}
	}
}


