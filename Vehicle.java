import java.util.*;
abstract class Vehicle
{
String vehicletype;
abstract void show();

}
abstract class Vendor extends Vehicle
{
	String vname;
	Vendor(String t)
	{
		super(t);
	
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
	Type(String s)
	{
		super(s);
	
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
	Car(String n,String c)
	{
		super(n);
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
		Vehicle v=new Vendor("FOUR VEHILER");
		Type t=new Type("Audi");
		Car c=new Car("Soupe","R8");
		v.show();
		t.vendorshow();
		c.typeShow();
		c.carShow();
		
	}
}