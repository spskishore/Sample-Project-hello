package Textng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_saucedemo {
	
	
	public void login(String id, String password, WebDriver dr)
	{
		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[1]")).sendKeys(id);
		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[2]")).sendKeys(password);
		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[3]")).click();
	}

}
