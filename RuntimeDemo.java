package com.javaTraining;

public class RuntimeDemo {
	protected RuntimeDemo()
	{
		
	}

	public static void main(String[] args) {
		Runtime obj=Runtime.getRuntime();
		Process objp=null;
		try {
			objp=obj.exec("notepad.exe");
			System.out.println(obj.freeMemory());
			System.out.println(obj.totalMemory());
			System.out.println(System.getProperty("java.vendor"));
			obj.gc();
			
		}
		catch(Exception e)
		{
			System.out.println("error executing calculator");
		}
		
		// TODO Auto-generated method stub

	}

}
