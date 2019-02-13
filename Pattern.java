import  java.util.Scanner;
class Pattern
{
 public static void main(String [] args)
 {
	  Scanner s = new Scanner(System.in);
	 
	
  for(int i=1;i<=5;i++)
  {
     for(int j=5;j>=i;j--)
	 {
	  System.out.print(j+" ");
	 }
	 System.out.println();
  }
 
 }
}