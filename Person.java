import java.util.Scanner;
class Person
{
private String name;
private int age;
Scanner s;
public String constituency;
Person() //constructor
{
	System.out.println("Voter eligibilty App");
	age=0;
	name="";
	constituency="Noida";
	s=new Scanner(System.in);
}
Person(String n,int a)
{
	name=n;
	age=a;
	
}
Person(String n,int a,String c)
{
	name=n;
	age=a;
	constituency=c;
}
public void input()
{
 
System.out.println("enter your name:");
name=s.next();
System.out.println("enter your age:");
age=s.nextInt();
}
public void print()
{
System.out.println(" name is:"+name);
System.out.println("age is:"+age);
System.out.println("constituency is:"+constituency);
}
public void valid()
{
	if(age>18)
		System.out.println("you are elegible");
	else
			System.out.println("you are not elegible");
}
}
class PersonTest
{
public static void main(String [] args)
{
Person p=new Person();
Person p1=new Person("Nandini",7);
Person p2=new Person("Aswani",22,"Mathura");
p.input();
p.print();
p.valid();
p1.print();
p1.valid();
p2.print();
p2.valid();
}
}