import java.util.Scanner;
class Scanner
{
 public static void main(String [] args)
 {
	 System.out.println("first number:");
 	 Scanner s = new Scanner(System.in);
	 int num1 = s.nextInt();
	 	 System.out.println("second number:");
		 int num2 = s.nextInt();
	 int num3= num1 + num2;
	 System.out.println("the answer is:"+num3);
	  
  
 }
 }
