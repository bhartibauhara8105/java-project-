import java.util.Scanner;
class  CopyArray
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array:");
int n=s.nextInt();
int []a= new int[n];
int []b=new int[n];
System.out.println("enter array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int j=0;j<n;j++)
{
b[j]=a[j];
}
System.out.println("elements in b are:");
for(int i=0;i<n;i++)
{
System.out.println(b[i]);
}
}
}


