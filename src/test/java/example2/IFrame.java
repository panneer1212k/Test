package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = Helperclass.browserSetting("chrome");
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
//	WebElement iframe = driver.findElement(By.name("SingleFrame"));
	driver.switchTo().frame(1);
	Thread.sleep(2000);
	WebElement input = driver.findElement(By.xpath("//input['type=text']"));
	input.sendKeys("selenium");
	
	driver.switchTo().defaultContent();
	WebElement inlineframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	inlineframe.click();
	WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outerframe);
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerframe);
	WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("selenium");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Single Iframe")).click();
}
}
