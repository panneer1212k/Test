package example1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstauto1 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();   //Object creation
	
	driver.get("https://www.google.com/");    //URL launch
	
	driver.manage().window().maximize(); 
	
	WebElement element = driver.findElement(By.linkText("mai"));
	element.click();

}
}
