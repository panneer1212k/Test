package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
public static void main(String[] args) {
	WebDriver obj2 = new ChromeDriver();   
	obj2.get("https://www.google.com/");    	
	obj2.manage().window().maximize(); 	
	WebElement link = obj2.findElement(By.linkText("About"));
	link.click();
}
}
