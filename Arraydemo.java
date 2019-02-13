class Arraydemo
{
   public static void main(String [] args )
   {
    int[] num={8,18,5,2,1,10};
	int sum=0;
	System.out.println("total no. of elements are:"+num.length);
	System.out.println("first element is:"+num[0]);
	System.out.println("last  element is:"+num[num.length-1]);
	for(int i=0;i<num.length;i++)
	{
		sum+=num[i];
	}
	System.out.println("the sum of elements is:"+sum);
   }
}