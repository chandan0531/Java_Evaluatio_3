package com.eval.Q3;

import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m) {
		
		
		switch(m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year Jan");
			break;
		case FEB:
			System.out.println("This is the 2nd Month of the Year Feb");
			break;
		case MAR:
			System.out.println("This is the 3rd Month of the Year Mar");
			break;
		case APR:
			System.out.println("This is the 4th Month of the Year Apr");
			break;
		case MAY:
			System.out.println("This is the 5th Month of the Year May");
			break;
		case JUN:
			System.out.println("This is the 6th Month of the Year Jun");
			break;
		case JUL:
			System.out.println("This is the 7th Month of the Year Jul");
			break;
		case AUG:
			System.out.println("This is the 8th Month of the Year Aug");
			break;
		case SEP:
			System.out.println("This is the 9th Month of the Year Sep");
			break;
		case OCT:
			System.out.println("This is the 10th Month of the Year Oct");
			break;
		case NOV:
			System.out.println("This is the 11th Month of the Year Nov");
			break;
		case DEC:
			System.out.println("This is the 12th Month of the Year Dec");
			break;
			default:
			System.out.println("Invalid Month Name");	
		}
	}
	
	public static void main(String[] args) {
			
		Demo d1 = new Demo();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter month name");
		String month = scn.next();
		
		Month m = Month.valueOf(month);
//		Month m = Month.APR;
		
		d1.showDetails(m);
	}
}
