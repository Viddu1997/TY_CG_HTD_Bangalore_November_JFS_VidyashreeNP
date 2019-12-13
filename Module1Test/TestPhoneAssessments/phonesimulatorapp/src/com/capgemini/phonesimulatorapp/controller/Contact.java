package com.capgemini.phonesimulatorapp.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.phonesimulatorapp.bean.ContactBean;
import com.capgemini.phonesimulatorapp.dao.ContactDAO;
import com.capgemini.phonesimulatorapp.factory.ContactFactory;

public class Contact {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ContactBean c=new ContactBean();
		ContactDAO dao=ContactFactory.getContactDAO(c);
		
		while(true)
		{
			System.out.println("Press 1 to Insert Contact Details");
			System.out.println("Press 2 to Modify Contact Details");
			System.out.println("Press 3 to Delete Contact Details");
			System.out.println("Press 4 to Get All Contacts Details");
			System.out.println("Press 5 For Home");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
				    System.out.println("Enter the Contact Name");
				    String name=sc.next();
				    System.out.println("Enter the Contact Number");
				    int number=sc.nextInt();
				    System.out.println("Enter the Group Name");
				    String groupname=sc.next();
				    c.setName(name);
				    c.setNumber(number);
				    c.setGroupname(groupname);
				    
				   
				    boolean check=dao.addContact(c);
				    if(check)
				    {
				    	System.out.println("Contact Added Successfully");
				    }
				    else
				    {
				    	System.out.println("Contact Not Added");
				    }
				    break;
			case 2:
				  System.out.println("Enter the Contact Name");
				    String name1=sc.next();
				   System.out.println("Enter the Contact Number");
				   int number1=sc.nextInt();
				  
				    System.out.println("Enter the Customer Group Name");
				    String groupname1=sc.next();
				   
				    boolean check1=dao.editContact(name1, number1);
				    if(check1)
				    {
				    	System.out.println("Contact Modified Successfully");
				    }
				    else
				    {
				    	System.out.println("Contact Not Modified");
				    }
				 
				   
				  
				  break;
			case 3:
				 System.out.println("Enter Contact Number to be Deleted");
				   int number2=sc.nextInt();
				   System.out.println("Enter Contact Name to be Deleted");
				   String Name=sc.next();
				   boolean check2=dao.deleteContact(number2);
				   if(check2)
				   {
					   System.out.println("Contact Deleted");
				   }
				   else
				   {
					   System.err.println("Contact Not Found");
				   }
				  break;
			case 4:
				 List<ContactBean> c1=dao.getAllContacts(c);
				 if(c1!=null)
				 {
					 for(ContactBean user:c1)
					 {
						 System.out.println(user);
					 }
				 }
				 else
				 {
					 System.out.println("Contact Not Found");
				 }
				  break;
			case 5:HomePage.main(args);
			        break;
				  default:
					      break;
				    
				   
				    
				   
				   
				   
				    
			}
		}
	}
}

		
	


