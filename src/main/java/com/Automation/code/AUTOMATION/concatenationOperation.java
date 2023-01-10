package com.Automation.code.AUTOMATION;

public class concatenationOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=8;
		System.out.println(i+j);//concatenation is joining two things, and happens from left to right

		String n1="sara";
		String n2="jam";
		System.out.println(n1+n2);
		
		char c1='3';
		char c2='h';
		System.out.println(c1+c2);//ascii value(American Standard Code for Information Interchange)
		
		System.out.println(n1+n2+i+j);
		System.out.println(i+j+n1+n2);
		System.out.println(n1+n2+(i+j));
	}

}
