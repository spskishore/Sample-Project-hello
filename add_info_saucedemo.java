package Textng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add_info_saucedemo {
	
	public static void add_info(String FN, String LN, String ZC, WebDriver dr)
	{
		dr.findElement(By.xpath("//div[@class='checkout_info']/input[1]")).sendKeys(FN);
		dr.findElement(By.xpath("//div[@class='checkout_info']/input[2]")).sendKeys(LN);
		dr.findElement(By.xpath("//div[@class='checkout_info']/input[3]")).sendKeys(ZC);
		dr.findElement(By.xpath("//div[@class='checkout_buttons']/input")).click();

	}

}
