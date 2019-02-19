package com.javaTraining;

public class Converse {
void tobeConvert()
{
	String binary,hex,octal;
	int num =14;
	Integer obj=new Integer(num);
	binary = obj.toBinaryString(num);
	hex = obj.toHexString(num);
	octal = obj.toOctalString(num);
	System.out.println("DEcimal value :"+num);
	System.out.println("Bimary value:"+binary);
    System.out.println("HexaDecimal value:"+hex);
    System.out.println("Ocatal equivalent:"+octal);
}
public static void main(String [] args)
{
Converse o=new Converse();
o.tobeConvert();
}

}