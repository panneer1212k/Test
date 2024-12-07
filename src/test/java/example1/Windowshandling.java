package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Windowshandling {
	public static void main(String[] args) {	
		WebDriver driver = Basetest3.browserSetting("chrome");
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement inputbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));

inputbox.sendKeys("Selenium");
inputbox.sendKeys(Keys.ENTER);

//Getting all the links

// driver.findElement(By.xpath("//a[text()='Selenium']")).click();
// driver.close();
 
 List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

for(WebElement link:allLinks)
{
	link.click();

}

//Getting parent window ID

String parentwindowID = driver.getWindowHandle(); //Get the parent window ID

System.out.println("Parent window id is :" +parentwindowID);

//Switched to all the child windows and get the title of it

Set<String> allhandles = driver.getWindowHandles();
//
//for(String Currhandle: allhandles)
//{
//	
//	driver.switchTo().window(Currhandle);
//	String title = driver.getTitle();
//	System.out.println(title);
//}

////
//for(String Currhandle: allhandles)
//{
//	if(parentwindowID==Currhandle)
//	{
//	driver.switchTo().window(Currhandle);
//	String title = driver.getTitle();
//	System.out.println("parent id"+title);
//}
//}

//
//for(String Currhandle: allhandles)
//{
//	
//	driver.switchTo().window(Currhandle);
//	String title = driver.getTitle();
//	
//		if(title.equals("Selenium (software) - Wikipedia"))
//				{
//					System.out.println(title);
//					driver.close();
//					
//				}
//}
//


//we can convert the set into list, because list is an index bases, we can easily pass the index and switch
//on the particular window

List<String> l = new ArrayList<>(allhandles);  //

//for (String a :l)
//{
//	driver.switchTo().window(a);
//	driver.close();
//}

driver.switchTo().window(l.get(4));

String title = driver.getTitle();
System.out.println(title);


}
}

