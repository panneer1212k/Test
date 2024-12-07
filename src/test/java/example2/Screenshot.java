package example2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Screenshot {
	public static void captureScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/amazon" +System.currentTimeMillis()+ ".png");	
		FileUtils.copyFile(temp, dest);
	}
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = Helperclass.browserSetting("chrome");
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fdeals%3Fref_%3Dnav_ya_signin%26discounts-widget%3D%252522%25257B%25255C%252522state%25255C%252522%25253A%25257B%25255C%252522refinementFilters%25255C%252522%25253A%25257B%25257D%25257D%25252C%25255C%252522version%25255C%252522%25253A1%25257D%252522%26bubble-id%3Ddeals-collection-mobile-and-computer-accessories&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Screenshot.captureScreenshot(driver);
		WebElement login = driver.findElement(By.id("ap_email"));
		login.sendKeys("panneer@gmail.com");
		Screenshot.captureScreenshot(driver);
		driver.findElement(By.id("continue")).click();
		Screenshot.captureScreenshot(driver);
		driver.close();
	}
}

