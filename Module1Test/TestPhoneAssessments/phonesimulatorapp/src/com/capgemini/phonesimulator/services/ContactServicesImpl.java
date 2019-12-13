package com.capgemini.phonesimulator.services;

import java.util.List;

import com.capgemini.phonesimulatorapp.bean.ContactBean;
import com.capgemini.phonesimulatorapp.dao.ContactDAO;
import com.capgemini.phonesimulatorapp.factory.ContactFactory;

public class ContactServicesImpl implements ContactServices {
	ContactDAO dao=ContactFactory.instanceofContactDAOImpl();

	@Override
	public List<ContactBean> getAllContacts(ContactBean bean) {
		return dao.getAllContacts(bean);
	}

	@Override
	public boolean updateContact(String name,int number) {
		return dao.editContact(name, number);
	}

	@Override
	public boolean DeleteContactr(int number) {
		return dao.deleteContact(number);
	}

	@Override
	public boolean InsertContact(ContactBean user) {
		
			
			return dao.addContact(user);
		}
		
		
	}


