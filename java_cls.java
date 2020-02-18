package Textng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class java_cls {
	WebDriver dr;
	
	public String login(String id, String pwd, WebDriver dr)
	{
		dr.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a")).click();
		dr.findElement(By.xpath("//input[@class='email']")).sendKeys(id);
		dr.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String s=dr.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).getText();
		dr.findElement(By.xpath("//div[@class='header-links']/ul/li[2]/a")).click();
		return s;
	}
	public java_cls(WebDriver dr) {
		this.dr=dr;
	}

}
