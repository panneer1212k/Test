package example2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWebTable {
public static void main(String[] args) {
	WebDriver driver = Helperclass.browserSetting("chrome");
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	List<WebElement> allrows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	int rows=allrows.size();
	System.out.println(rows);
	List<WebElement> allcolumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
	int columns=allcolumns.size();
	System.out.println(columns);
	for(int row=2;row<=rows;row++) {
		for(int col=1;col<=columns;col++) {
			String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+col+"]")).getText();
			System.out.println(text);
		}
		System.out.println( );
	}
	driver.close();
}
}
