 import java.util.Scanner;
class Condition
{
 public static void main(String [] args)
 {
	 
 	 Scanner s = new Scanner(System.in);
	 
	 System.out.println("enter first number");
	 int a=s.nextInt();
	  System.out.println("enter second number");
	 int b=s.nextInt();
	  int c;
 
	   System.out.println("enter the operator");
	 char y=s.next().charAt(0);
	 
	  switch(y)
	  {
		  case  '+':
		           c=a+b;
				   System.out.println("the add is: "+c);
		           break;
		  case  '-':
		           c=a-b;
				   System.out.println("the subtract is: "+c);
                   break;
		  case  '*':
					c=a*b;
				   System.out.println("the mul is: "+c);
		           break;
		  case  '/':
						c=a/b;
				   System.out.println("the div is: "+c);
				   break;
		  default :
				System.out.println("invalid operator ");
				
                		  
	  }
	 
	}
}	