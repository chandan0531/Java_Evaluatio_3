package com.eval.Q4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Customer {
	
	String username;
	String password;
	String mobileNumber;
	String email;
	
	public Customer() {
		
	}
	

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		
		if(Pattern.matches("[a-zA-Z]{7}", username))
		{
			
			this.username = username;
		}
		else
		{
			System.out.println("error username.");
		}
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(Pattern.matches("[a-zA-z0-9]{7}", password))
		{
			
			this.password = password;
		}
		else
		{
			System.out.println("error pass.");
		}
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber))
		{
			
			this.mobileNumber = mobileNumber;
		}
		else
		{
			System.out.println("error mobile no.");
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
