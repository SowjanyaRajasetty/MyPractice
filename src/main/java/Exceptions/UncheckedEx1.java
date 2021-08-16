package Exceptions;

public class UncheckedEx1 {

	public static void method1() //throws ArithmeticException
	{
		try {
		int i=1/0;
		}
		catch(ArithmeticException AE)
		{
			System.out.println(AE);
		}
		catch(Exception e)
		{}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

}
