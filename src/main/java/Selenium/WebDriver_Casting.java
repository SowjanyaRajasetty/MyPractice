package Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriver_Casting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"),chromeOptions);
		newdriver driver1=new NewChromeDriver();
		driver1.newfindElement();
		
	}
}

interface newdriver 
{	
void newfindElement();

}
class NewChromeDriver implements newdriver
{

	@Override
	public void newfindElement() {
		// TODO Auto-generated method stub
		
	}
	public void newfindElements()
	{}
	
}
