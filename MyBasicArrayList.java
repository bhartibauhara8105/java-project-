package com.javaTraining;

import java.util.ArrayList;
import java.util.Collections;

public class MyBasicArrayList {
	public static void main(String [] args)
	{
     ArrayList<String> a=new ArrayList<String>();
     a.add("c");
     a.add("c++");
     a.add("java");
     a.add("c#");
     a.add("python");
     System.out.println(a);
     /* for(String s :a)
      {
    	  System.out.println(s);
      }*/
      System.out.println("element at index 1"+a.get(1));
      System.out.println("does list contains java?"+a.contains("java"));
      a.add(2,"play");
      System.out.println(a);
      System.out.println("is arraylist empty?"+a.isEmpty());
      System.out.println("index of python is "+a.indexOf("python"));
      System.out.println("size of the arraylist is : "+a.size());
      Collections.sort(a);
      System.out.println(a);
}
}
