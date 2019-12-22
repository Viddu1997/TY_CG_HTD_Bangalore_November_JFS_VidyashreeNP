package com.capgemini.filpkart.services;

import java.util.List;

import com.capgemini.filpkart.bean.ProductBean;
import com.capgemini.filpkart.dao.ProductDAO;
import com.capgemini.filpkart.factory.ProductFactory;

public class ProductServicesImpl implements ProductServices {
	ProductDAO dao=ProductFactory.instanceOfProductDAOImpl();

	@Override
	public boolean addProduct(ProductBean user) {
	return dao.addProduct(user);
			
		}
	

	@Override
	public List<ProductBean> getAllProducts() {
		return null;
		
	}

}
