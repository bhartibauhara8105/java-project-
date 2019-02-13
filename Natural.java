import  java.util.Scanner;
class Whilel
{
 public static void main(String [] args)
 {
	  Scanner s = new Scanner(System.in);
	 
	 System.out.println(" enter number");
	 int n=s.nextInt();
	int sum=0;
int count =1;
while(count<=n)
{ 
 sum+=count;
 count ++;
 if(n>1000 || n<1)
 {
	 System.out.println("enter number only fromv 1 to 1000");
         break;
 }
 }
 System.out.println("the sum is:"+sum);
 
 }
}