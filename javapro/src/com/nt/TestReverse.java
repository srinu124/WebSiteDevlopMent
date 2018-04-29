package com.nt;

import java.util.Scanner;

public class TestReverse {
public static void main(String[] args) {
	
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter the string");
	
	String s=sc.nextLine();
	String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
	}
	System.out.println("reverse of string :"+s2);
	if(s.equals(s2)) {
		System.out.println("given string is palindrome");
		
	}else {
		System.out.println("given string is not palindrome");
	}
}
}
