package com.javaTraining;

public class StringMethods {
	protected StringMethods()
	{
		
		
	}
	public static void main(String [] args)
	{
		String s="Java is a "+"platform independent language";
		String s1=" Hello World ";
		String s2="Hello";
		String s3="HELLO";
		System.out.println(s);
		System.out.println("index of t:"+s.indexOf('t'));
		System.out.println("last index of t="+s.lastIndexOf('t'));
		System.out.println("index of(t,10)"+s.indexOf('t',10));
		System.out.println("lastindex of('t',60)="+s.indexOf('t',60));
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(3,6));
		System.out.println(s2.concat("World"));
		System.out.println(s2.replace('l','w'));
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.trim());
	}

}
