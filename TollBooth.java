package com.javaTraining;

class TollBooth extends FordTruck implements Tollbooths {





double sum;
static double TollDue=0;
int count=0;
int recipt=201;
public  void TruckDetails(Object obj)
{
	System.out.println("Truck Arrival");
	 System.out.println("Axles : "+this.noOfAxles);

	

}
public void CalculateToll1(FordTruck obj) {
	int ax=obj.noOfAxles;
	
	ax=5*ax;
	int w=obj.weight;
	
	System.out.println("@@@@@@@@ "+ax+"  "+w);
	w=((w/1000)/2)*10;
	sum=ax+w;
	TollDue+=sum;

}

	

public void CalculateToll(NissanTruck obj1) {
	int ax=obj1.noOfAxles;
	
	ax=5*ax;
	int w=obj1.weight;
	
	System.out.println("@@@@@@@@ "+ax+"  "+w);
	w=((w/1000)/2)*10;
	sum=ax+w;
	TollDue+=sum;
}
public void CalculateToll(DaewooTruck obj2) {
	int ax=obj2.noOfAxles;
	
	ax=5*ax;
	int w=obj2.weight;
	
	System.out.println("@@@@@@@@ "+ax+"  "+w);
	w=((w/1000)/2)*10;
	sum=ax+w;
	TollDue+=sum;


	
}

	

	
	public void DisplayData() {
			
		System.out.println("*****Collecting recipts****");
		System.out.println("Total since last collection:"+recipt);
		System.out.println("Trucks:"+count);
		System.out.println("tolldue"+TollDue);
		}


	@Override
	public void CalculateToll(FordTruck obj) {
		// TODO Auto-generated method stub
		
	}


	public void CalculateToll(Truck nissan) {
		// TODO Auto-generated method stub
		
	}





		
}
