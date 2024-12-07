package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommand {
public static void main(String[] args) throws InterruptedException {
	WebDriver obj=new ChromeDriver();
//	obj.get("https://www.amazon.in/");
//	obj.manage().window().maximize();
//	WebElement hrm = obj.findElement(By.xpath("//a[text()='Careers']"));
//	hrm.click();
//	WebElement hr = obj.findElement(By.linkText("sign in"));
//	hr.click();
//	Thread.sleep(2000);
//	obj.close();
//	Thread.sleep(2000);
//	obj.quit();
	obj.get("https://www.orangehrm.com/");
	obj.manage().window().maximize();
	WebElement hrm = obj.findElement(By.xpath("//a[text()='Privacy Policy']"));
	hrm.click();
	Thread.sleep(1000);
	obj.close();
	Thread.sleep(2000);
	obj.quit();
	
}
}
