package com.javaTraining;

public class ExceptionsDemo {

	public static void main(String[] args) {
		String language[]= {"C","C++","Java","Perl","Python"};
		try
		{
			for(int c=0;c<=5;c++)
			{
				System.out.println(language[c]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}
}
