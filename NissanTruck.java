package com.javaTraining;

public  class NissanTruck implements Truck {
	int noOfAxles;
	int weight;

	public NissanTruck(int i, int j) {
	  noOfAxles=i;
	  weight=j;
	}

	public int getAxles()
	{
		return noOfAxles;
	}
	public int getWeight()
	{
		return 	weight;
	}


}
