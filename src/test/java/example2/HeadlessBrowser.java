package example2;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HeadlessBrowser {
public static void main(String[] args) throws InterruptedException {
	EdgeOptions e=new EdgeOptions();
	e.addArguments("--headless");		
	WebDriver driver=new EdgeDriver(e);
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();
	WebElement hrm = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	hrm.click();
	Thread.sleep(1000);
	driver.close();
}
}
