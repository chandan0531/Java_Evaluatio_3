package com.eval.Q4;

import java.util.Scanner;
import java.util.regex.*;



public class Demo {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		Customer cus = new Customer();

		
		System.out.println("Eneter the User name");
		String userName = scn.next();
		if(userName.length()>=3 && userName.length()<=8)
		{
			
			cus.setUsername(userName);
		}
		else
		{
			System.out.println("error username");
		}
		
		System.out.println("Eneter the MObile number");
		String mobile = scn.next();
		cus.setMobileNumber(mobile);
		
		System.out.println("Eneter the password");
		String pass = scn.next();
		if(pass.length()>=3 && pass.length()<=8) {
			
			cus.setPassword(pass);
		}
		else
		{
			System.out.println("error pass");
		}
		
		System.out.println("Eneter the email");
		String email = scn.next();
		cus.setEmail(email);
		
		
		//Printing all the details.
		System.out.println("Name : " + cus.getUsername());
		System.out.println("Mobile : " + cus.getMobileNumber());
		System.out.println("Password : " + cus.getPassword());
		System.out.println("Email : " + cus.getEmail());
		
		
	}
}
