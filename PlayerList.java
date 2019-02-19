package com.javaTraining;


import java.util.ArrayList;
import java.util.List;

public class PlayerList {
	ArrayList playerArray;
	List subListObj;
	PlayerList()
	{
		playerArray=new ArrayList();
		subListObj=new ArrayList();
		
	}
	void add()
	{
		for(int c=0;c<5;c++)
		{
			playerArray.add(new Integer(c));
		}
		playerArray.add("Bharti");
		playerArray.add("Abhishek");
		playerArray.add("Anamika");
		playerArray.add("Shubham");
		System.out.println();
		
	}
	void search()
	{
		System.out.println();
		System.out.println("******************************");
		System.out.println("SEARCH FOR AN OBJECT AND RETURN"+"the first and last position");
		System.out.println("*******************************"+"***************************");
		System.out.println();
		System.out.println("first occurence of String"+"\"Abhishek\"is at position"+playerArray.indexOf("Abhishek"));
		System.out.println("last occurence of the Stirng"+"\"Abhishek\"is at position"+playerArray.indexOf("Abhishek"));
		System.out.println();
		
	}
	void display()
	{
		System.out.println("*************"+"**********************");
		System.out.println("retrive objects from array list");
		System.out.println("*******************"+"****************");
		System.out.println();
		for(int c=0;c<playerArray.size();c++)
		{
			System.out.print(" "+playerArray.get(c));
		}
		
	}
	void extract()
	{
		System.out.println("***********************"+"***********************");
		System.out.println("extract a sublist and"+"then print the new list");
		System.out.println("***********************"+"************************");
		System.out.println();
		subListObj=playerArray.subList(5,playerArray.size());
		System.out.println("the new sub list from index 5 to"+playerArray.size()+"is :"+subListObj);
		System.out.println();
	}

}
