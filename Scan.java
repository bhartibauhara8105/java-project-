import java.util.Scanner;
class Scan
{
 public static void main(String [] args)
 {
	 System.out.println("enter your name  ");
 	 Scanner s = new Scanner(System.in);
	 String num1 = s.nextLine();
	 	 System.out.println("my name is "+num1);
		 char gender= s.next().charAt(0);
		  System.out.println("Gender :"+gender);
  
 }
 }
