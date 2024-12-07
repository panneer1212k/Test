package example2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement links : link) {
			String url = links.getAttribute("href");
			HelperBrokenlinks.Brokenlinkheck(url);
		}
	}

}
