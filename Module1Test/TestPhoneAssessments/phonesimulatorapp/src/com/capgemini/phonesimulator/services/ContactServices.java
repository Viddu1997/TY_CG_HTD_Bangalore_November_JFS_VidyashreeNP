package com.capgemini.phonesimulator.services;

import java.util.List;

import com.capgemini.phonesimulatorapp.bean.ContactBean;

public interface ContactServices {
	
	
	
	public boolean InsertContact(ContactBean user);

	

	boolean DeleteContactr(int number);

	boolean updateContact(String name, int number);



	List<ContactBean> getAllContacts(ContactBean bean);
	

}
