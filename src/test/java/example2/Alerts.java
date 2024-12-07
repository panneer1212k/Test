package example2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://letcode.in/alert");
	driver.manage().window().maximize();
	WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
	simple.click();
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
	alt.accept();
	WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
	confirm.click();
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.accept();
	confirm.click();
	Alert alert2 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert2.dismiss();
	WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
	prompt.click();
	Alert alrt = driver.switchTo().alert();
	alrt.sendKeys("panneer");
	Thread.sleep(2000);
	alrt.accept();
}
}
