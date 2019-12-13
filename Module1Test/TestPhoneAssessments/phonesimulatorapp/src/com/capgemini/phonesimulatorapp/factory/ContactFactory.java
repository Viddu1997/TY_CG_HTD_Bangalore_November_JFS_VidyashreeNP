package com.capgemini.phonesimulatorapp.factory;

import com.capgemini.phonesimulator.services.ContactServices;
import com.capgemini.phonesimulator.services.ContactServicesImpl;
import com.capgemini.phonesimulatorapp.bean.ContactBean;
import com.capgemini.phonesimulatorapp.dao.ContactDAO;
import com.capgemini.phonesimulatorapp.dao.ContactDAOImpl;

public class ContactFactory {
	private ContactFactory()
	{
		
	}
	public static ContactDAO instanceofContactDAOImpl()
	{
		ContactDAO dao= new ContactDAOImpl();
		return dao;
	}
	public static ContactServices instanceOfContactServices()
	{
		ContactServices services=new ContactServicesImpl();
		return services;
	}
	public static ContactDAO getContactDAO(ContactBean bean) {
		ContactDAO dao1=new ContactDAOImpl();
		return dao1;
	}

}



