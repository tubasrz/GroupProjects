package com.syntax.reviewclass2;

public class StringConcatDemo1 {

	public static void main(String[] args) {
		
		String name="10";
		int number1=10;
		char letter1='A';
		
		System.out.println(letter1+number1+name);
		System.out.println(letter1+name+number1);
		System.out.println(10+10+"10");
		System.out.println(10+"10"+10);
		System.out.println(10+"10"+10+10);  //1010-->string +num
		System.out.println(10+10+"10"+10+10);
		System.out.println(10+10+"10"+(10+10));
		System.out.println(3+10+"10"+(5+10));
	}

}
