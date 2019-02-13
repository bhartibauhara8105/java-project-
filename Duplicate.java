import java.util.Scanner;
class  Duplicate
{
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array:");
int n=s.nextInt();
int []a= new int[n];
System.out.println("enter array elements:");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=n-1;j>i;j--)
{
 if(a[i]<a[j])
 {
    int temp;
	temp=a[i];
	a[i]=a[j];
    a[j]=temp;
 }

 }
}
for(int i=0;i<n;i++)
{
	for(int j=n-1;j>i;j--)
	{
		 if(a[i]==a[j])
 {
   System.out.println("the duplicate array is:"+a[j]);
   	 i=j++;
	 break;
	}
}
 

}
}
}