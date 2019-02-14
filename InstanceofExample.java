public class InstanceofExample
{
public static void main(String [] args)
{
 Vehicle v=new Vehicle();
 Car c=new Car();
 MotorCycle moto=new MotorCycle();
 System.out.println("vehicle intance of Vehicle:"+(v instanceof Vehicle));
  System.out.println("Car intance of Vehicle: "+(c instanceof Vehicle));
   System.out.println("Car intance of Car: "+( c instanceof Car));
 System.out.println("car instanceof DriveCar: "+(c instanceof DriveCar));
       System.out.println("moto intance of Vehicle: "+(moto instanceof Vehicle));
 System.out.println("moto intance of  MotorCycle: "+(moto instanceof MotorCycle));
 System.out.println("vehicle intance of car: "+(v instanceof Car));
 System.out.println("vehicle intance of DriveCar: "+(v instanceof DriveCar));
 System.out.println("moto intance of DriveCar: "+(moto instanceof DriveCar));
 System.out.println("(c=null) intance of Vehicle: "+(c instanceof Vehicle)); 
  System.out.println("(c=null) intance of Car: "+(c instanceof Car));
}
}
class Vehicle
{

}
class Car extends Vehicle implements DriveCar
{

}
class MotorCycle extends Vehicle{
}
interface DriveCar{
}
