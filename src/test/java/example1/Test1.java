package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) {
	WebDriver obj=new ChromeDriver();
	obj.get("https://www.facebook.com/");
	obj.manage().window().maximize();
	WebElement forgot = obj.findElement(By.xpath("//a[text()='Forgotten password?']"));
	forgot.click();
	
}
}
