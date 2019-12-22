package com.capgemini.filpkart.dao;

import java.util.List;

import com.capgemini.filpkart.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public List<ProductBean> getAllProduct(ProductBean bean);

}
