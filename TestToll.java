package com.javaTraining;

public class TestToll  {

	public static void main(String[] args) {
		TollBooth booth = new TollBooth();

		FordTruck ford = new FordTruck(5, 12000);  
		NissanTruck nissan = new NissanTruck(2, 5000);  
			DaewooTruck daewoo = new DaewooTruck(6, 17000);        
		booth.CalculateToll(ford);
		booth.DisplayData();
		
		booth.CalculateToll(nissan);
			booth.DisplayData();
			  
			booth.CalculateToll(daewoo);
			booth.DisplayData();


	}

}
