package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
public static void main(String[] args) {
	WebDriver obj=new ChromeDriver();
	obj.get("https://demo-opencart.com/");
	WebElement full = obj.findElement(By.xpath("//*[@id=\'search\']/input"));
	full.sendKeys("iphone");
	full.sendKeys(Keys.ENTER);
	
	
	system.out.println(i have make changes);
}
}

