package example2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helperclass {
	public static WebDriver browserSetting(String name){
		WebDriver base = null;		
		switch(name){
		case "chrome":
			base = new ChromeDriver();
			break;
		
		case "firefox":
			base = new FirefoxDriver();
		     break;		     
		default:			
			System.out.println(" Provide a valid browser");		
		}		
		return base;
	}
}
