package com.capgemini.phonesimulatorapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.phonesimulatorapp.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO {
	private List<ContactBean> contactbean=new ArrayList<ContactBean>();

	@Override
	public List<ContactBean> getAllContacts(ContactBean bean) {
		return contactbean;
	}
	
	@Override
	public boolean deleteContact(int number) {
		
			ContactBean bean=null;
			for(ContactBean c1:contactbean)
			{
				if(c1.getNumber()==number)
				{
					bean=c1;
				}
				
				if(bean!=null)
				{
					contactbean.remove(bean);
					return true;
				}
			}
			return false;
		}
		
		
		
	
	
	@Override
	public boolean editContact(String name, int number) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
@Override
	public boolean addContact(ContactBean bean) {
		
			for(ContactBean c:contactbean)
			{
				if(c.getNumber()==bean.getNumber())
				{
					return false;
				}
			}
			contactbean.add(bean);
			return true;
		}



}








	