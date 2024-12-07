package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class conditionaltest3 {
public static void main(String[] args) throws InterruptedException {
	WebDriver obj = Basetest3.browserSetting("chrome");
	obj.get("https://www.facebook.com/");
	obj.manage().window().maximize();
	WebElement txt = obj.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//	Conditional 
	boolean displayed = txt.isDisplayed();
	System.out.println(displayed);
	WebElement txt1 = obj.findElement(By.xpath("//h2[@class='_8eso']"));
	boolean enabled = txt1.isEnabled();
	System.out.println(enabled);
		if(displayed==true && enabled==true) {
			System.out.println("It is Facebook");
		}
	
	System.out.println("========================================================");	
//	Application
	String title = obj.getTitle();
	System.out.println(title);
	String currentUrl = obj.getCurrentUrl();
	System.out.println(currentUrl);
	String pageSource = obj.getPageSource();
	System.out.println(pageSource);
	Thread.sleep(2000);
	obj.manage().window().minimize();
	Thread.sleep(2000);
	obj.close();
}
}
