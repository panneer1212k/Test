package example1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.ArrayList;
	import java.util.Set;

	public class WebElementExample {
	    public static void main(String[] args) throws InterruptedException {
	        // Set up ChromeDriver (assuming ChromeDriver is in your system's PATH)
//	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
//	        WebDriver driver = new ChromeDriver();
	    	WebDriver driver = Basetest3.browserSetting("chrome");
	    	
	        // Open a website in the first tab
	    	 driver.get("https://testautomationpractice.blogspot.com/");

	        // Get the current window handle (first tab)
	        String originalWindow = driver.getWindowHandle();
	        
	        // Open a new tab using JavaScript
	        ((JavascriptExecutor) driver).executeScript("window.open();");
	        
	        // Get the list of all window handles
	        Set<String> allWindows = driver.getWindowHandles();
	        ArrayList<String> windowList = new ArrayList<>(allWindows);

	        // Switch to the new tab (last window handle in the list)
	        driver.switchTo().window(windowList.get(1));

	        // Open a new URL in the new tab
	        driver.get("https://selenium.dev");

	        // Optional: Do something in the new tab (e.g., print the page title)
	        System.out.println("Title of new tab: " + driver.getTitle());

	        // Close the new tab
	        driver.close();

	        // Switch back to the original tab
	        driver.switchTo().window(originalWindow);

	        // Optional: Print the title of the original tab
	        System.out.println("Title of original tab: " + driver.getTitle());

	        // Close the original tab and quit the browser
	        driver.quit();
	    }
	}
	