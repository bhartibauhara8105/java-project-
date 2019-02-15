package com.javaTraining;

public class InsuranceCalculator {

	public static void main(String[] args) {
	  InsuranceRate obj=new InsuranceRate();
	  String inData="1995";
	  try
	  {
		  System.out.println("Your insurance is:"+obj.calculateRate(inData));
		  
	  }
	  catch (Exception oops)
	  {
		  System.out.println("too young foir insurance");
	  }
	  

	}

}
