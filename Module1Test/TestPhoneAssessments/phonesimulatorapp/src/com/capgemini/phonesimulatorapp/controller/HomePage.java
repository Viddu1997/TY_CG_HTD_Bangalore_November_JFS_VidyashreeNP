package com.capgemini.phonesimulatorapp.controller;

import java.util.Scanner;

public class HomePage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For Contract");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			  Contact.main(null);
			  break;
		
        default:
				break;
		}
		
		
	}



	}

