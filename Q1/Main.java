package com.eval.Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("enter array size");
		int num = scn.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter Number");
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter the index");
		
		try {
			int nu = scn.nextInt();
			System.out.println("The array element at index" + num + "=" + arr[nu]);
			
		}
		catch(ArrayIndexOutOfBoundsException el)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException el)

		{
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
