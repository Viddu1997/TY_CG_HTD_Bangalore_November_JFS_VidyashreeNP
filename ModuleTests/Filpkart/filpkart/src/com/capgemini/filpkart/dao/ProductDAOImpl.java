package com.capgemini.filpkart.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.capgemini.filpkart.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	Scanner sc=new Scanner(System.in);
	Connection conn=null;
	PreparedStatement pstmt=null;
	FileReader reader;
	Properties prop;
    ProductBean user;
	public ProductDAOImpl() 
	{
		try
		{
			reader=new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	


	@Override
	public boolean addProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insertQuery"))){
			pstmt.setInt(1, bean.getPid());
			pstmt.setString(2, bean.getPname());
			pstmt.setInt(3, bean.getPCost());
			pstmt.setString(4, bean.getColor());
			pstmt.setString(5, bean.getPdesc());
			
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				return false;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return true; 
	}

		@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {
			List<ProductBean> list=new ArrayList<ProductBean>();
			try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
					Statement stmt=conn.createStatement();
					ResultSet rs=stmt.executeQuery(prop.getProperty("quuery1"))){
							while(rs.next())
							{
								user=new ProductBean();
								user.setPid(rs.getInt(1));
								user.setPname(rs.getString(2));
								user.setPCost(rs.getInt(3));
								user.setColor(rs.getString(3));
								user.setPdesc(rs.getString(3));
							
								list.add(user);
							}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}

		
	}


