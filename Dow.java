import  java.util.Scanner;
class Whilel
{
 public static void main(String [] args)
 {
	  Scanner s = new Scanner(System.in);
	  String guess;
 
 do
{ 
  System.out.println("Guess my name :");
  guess=s.nextLine();
 
 }while(!"Bharti".equals(guess));
 System.out.println("Congratulations u guess the name:");
 
 }
}