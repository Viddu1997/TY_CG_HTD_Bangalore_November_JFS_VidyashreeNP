package com.capgemini.phonesimulatorapp.dao;

import java.util.List;

import com.capgemini.phonesimulatorapp.bean.ContactBean;

public interface ContactDAO {
	
	
	
	public boolean editContact(String name,int number);
	public boolean search(String name);
	boolean addContact(ContactBean bean);

	List<ContactBean> getAllContacts(ContactBean bean);
	boolean deleteContact(int number);
	
}





