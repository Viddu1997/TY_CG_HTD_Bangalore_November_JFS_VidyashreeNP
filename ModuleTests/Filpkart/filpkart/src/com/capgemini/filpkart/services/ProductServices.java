package com.capgemini.filpkart.services;

import java.util.List;

import com.capgemini.filpkart.bean.ProductBean;

public interface ProductServices {
	public boolean addProduct(ProductBean user);
	
	public List<ProductBean> getAllProducts();
	
	

}






