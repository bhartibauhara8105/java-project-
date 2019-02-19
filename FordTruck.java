package com.javaTraining;

public   class FordTruck implements Truck{
	
	
public int noOfAxles;
public int weight;
FordTruck()
{
	
}
FordTruck(int a,int b)
{
	noOfAxles=a;
	weight=b;
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
