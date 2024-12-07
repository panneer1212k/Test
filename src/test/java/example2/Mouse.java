package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mouse {
public static void main(String[] args) {
	WebDriver driver = Helperclass.browserSetting("chrome");
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//"));
	
}
}
