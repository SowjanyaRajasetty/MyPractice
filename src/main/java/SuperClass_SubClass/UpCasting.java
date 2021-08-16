package SuperClass_SubClass;

import org.openqa.selenium.chrome.ChromeDriver;


class Super{
	
	public void superMethodA()
	{}
	public void superMethodB()
	{}
	
	public void common()
	{
		System.out.println("common-Super");
	}
}

class Subclass extends Super{
	public void subMethodA()
	{}
	public void subMethodB()
	{}
	public void common()
	{
		System.out.println("common-Sub");
	}

}
public class UpCasting {
	public static void main(String[] args) {
		
		Super superRef=new Subclass();	//upcasting
		superRef.superMethodA();
		superRef.superMethodB();
		superRef.common();
		
		Subclass subRef=new Subclass();
		subRef.subMethodA();
		subRef.subMethodB();
		subRef.superMethodA();
		subRef.superMethodB();
		subRef.common();
		}
}
