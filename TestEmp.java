import java.util.*;
class Employee
{
  protected String name;
  protected int Empcode;
  protected String Address;
Employee()
{
}
Employee(String n,int c,String a)
{
name=n;
Empcode=c;
Address=a;
}  
void display()
{
System.out.println("the name of employee:"+name);
System.out.println("the Empcode of employee:"+Empcode);
System.out.println("the Address of employee:"+Address);
}
}
class Manager extends Employee
{
 String Dept;
 Manager(String n,int e,String a,String d)
 {
    super(n,e,a);
	Dept=d;
 }
 void display()
 {
 super.display();
 System.out.println("the Dept of manager :"+Dept);
 }
}
class Developer extends Employee
{
String specific;
Developer(String n,int c,String a,String s)
{
super(n,c,a);
specific=s;
}
}

class TestEmp
{
public static void main(String [] args)
{
Manager m=new Manager("Bharti",5003,"New york","HR");
m.display();
Developer d=new Developer("Abhishek",5001,"Paris","web developer");
d.display();
}
}