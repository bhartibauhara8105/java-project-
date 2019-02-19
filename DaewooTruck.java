package com.javaTraining;

public  class DaewooTruck implements Truck {
	int noOfAxles;
	int weight;

	public DaewooTruck(int i, int j) {
	    noOfAxles=i;
	    weight=j;
	}

  public  int  getAxles()
   {
	   return noOfAxles;
   }
   public int getWeight()
   {
	   return weight;
   }

}
