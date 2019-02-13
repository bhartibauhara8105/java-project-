import  java.util.Scanner;
class Breakdemo
{
 public static void main(String [] args)
 {
	  Scanner s = new Scanner(System.in);
	   int num1,sum=0;
	   for(int i=0;i<5;i++)
	   { 
	      System.out.println("enter number");
		  num1=s.nextInt();
		  if(num1<=0)
		  { 
		  continue;
		  }
		  sum+=num1;
	   }
	   
	   System.out.println("the sum is:"+sum);
}
	   }