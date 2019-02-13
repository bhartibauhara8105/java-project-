import java.util.Scanner;
class Dimond
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of rows");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
    System.out.print(" ");
}
for(int a=1;a<=i*2-1;a++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=n-1;i>0;i--)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");

}
for(int z=1;z<=i*2-1;z++)
{
System.out.print("*");
}
System.out.println();
}

}
}