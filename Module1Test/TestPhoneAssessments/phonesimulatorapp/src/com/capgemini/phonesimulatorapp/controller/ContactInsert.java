package com.capgemini.phonesimulatorapp.controller;

import java.util.Scanner;

import com.capgemini.phonesimulator.services.ContactServices;
import com.capgemini.phonesimulatorapp.bean.ContactBean;
import com.capgemini.phonesimulatorapp.factory.ContactFactory;

public class ContactInsert {
	public static void main(String[] args) {
		ContactServices services=ContactFactory.instanceOfContactServices();
		ContactBean user=new ContactBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER CONTACT NUMBER......");
		user.setNumber(Integer.parseInt(sc.nextLine()));
		System.out.println("ENTER CONTACT NAME......");
		user.setName(sc.nextLine());
		System.out.println("ENTER GROUP NAME......");
		user.setGroupname(sc.nextLine());
		
		
		if(services.InsertContact(user))
		{
			System.out.println("USER INSERTED......");
		}
		else
		{
			System.err.println("SOMETHING WENT WRONG");
		}
		
		
		
		sc.close();
		
	}
	
	



	}


