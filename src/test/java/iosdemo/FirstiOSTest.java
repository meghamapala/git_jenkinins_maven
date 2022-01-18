package iosdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class FirstiOSTest {

	public static void main(String[] args) throws MalformedURLException {
           
		firstTest();
	}
	
	public static void firstTest() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", "14.5");
		caps.setCapability("deviceName", "iPhone 8 Plus");
		//caps.setCapability(CapabilityType.BROWSER_NAME,"safari" );
		caps.setCapability("app", "/Users/meghamapalagama/Library/Developer/Xcode/DerivedData/"
				+ "WebDriverAgent-ciegwgvxzxdrqthilmrmczmqvrgu/Build/"
				+ "Products/Debug-iphonesimulator/IntegrationApp.app");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		IOSDriver driver = new IOSDriver(url, caps);
		
		System.out.println("Completed Successfully");
		
		

		
	}

}
