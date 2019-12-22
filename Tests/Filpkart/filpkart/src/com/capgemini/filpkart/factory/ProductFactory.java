package com.capgemini.filpkart.factory;

import com.capgemini.filpkart.dao.ProductDAO;
import com.capgemini.filpkart.dao.ProductDAOImpl;
import com.capgemini.filpkart.services.ProductServices;
import com.capgemini.filpkart.services.ProductServicesImpl;

public class ProductFactory {
	private ProductFactory()
	{
		
	}

	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao=new ProductDAOImpl();
		return dao;
	}

	
	public static ProductServices instanceOfProductServicesImpl() {
		ProductServices services=new ProductServicesImpl();
		return services;
		
	}

	
	
	
	
	

	
}






