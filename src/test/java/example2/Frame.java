package example2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
		
		public static void main(String[] args) {
			WebDriver driver = Helperclass.browserSetting("chrome");
			
			driver.get("https://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
			
			//switching to single frame using id
			
//			driver.switchTo().frame("singleframe")

			//switching to single frame using frame element
			
//		WebElement iframe = driver.findElement(By.name("SingleFrame"));
//			
//			driver.switchTo().frame(iframe);
//					
//			WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
//			
//			inputbox.sendKeys("selenium");
			
			
			//switching to single frame using index
			
			driver.switchTo().frame(1);
			
			WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
			
			inputbox.sendKeys("selenium");
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Single Iframe")).click();
			
			
		}

	}

