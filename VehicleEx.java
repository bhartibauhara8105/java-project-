import java.util.*;
abstract class Vehicle
{
String vehicletype;
abstract void show();

}
abstract class Vendor extends Vehicle
{
	String vname;
	Vendor()
	{
		
	
	}
	void show()
	{
		System.out.println("the vehicle type :"+vehicletype);
	}
   abstract void vendorshow();
}
abstract class Type extends Vendor
{
	String vtype;
	Type()
	{
		
	
	}
	void vendorshow()
	{
		System.out.println("the vehicle name is:"+vname);
	}
	abstract void typeShow();
	
}
class Car extends Type
{
	String carname;
	Car(String v,String vn,String t,String c)
	{
		this.vehicletype=v;
		this.vname=vn;
		this.vtype=t;
		carname =c;
	}
	void typeShow()
	{
	  System.out.println("the car type is:"+vtype);	
	}
	void carShow()
	{
		System.out.println("the car name is:"+carname);
	}
}
class VehicleEx
{
	public static void main(String [] args)
	{
		 
		Car c=new Car("fourVEHILER","Audi","soupe","R8");
		c.show();
		c.vendorshow();
		c.typeShow();
		c.carShow();
		
	}
}