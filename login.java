package Textng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class login {
	
	loginfuction l=new loginfuction();
	WebDriver dr;
	@BeforeMethod
	public void t() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		 dr = new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com");
		
	}
	@AfterMethod
	public void m() {
		dr.close();
	}
	
  @Test
  public void f1() {
	  String m=l.login("buttam1703@gmail.com", "12345678", dr);
	  System.out.println(m);
  }
  @Test
  public void f2() {
	  String m1=l.login("buttam1703@gmail.com", "12345678", dr);
	  System.out.println(m1);
  }
  
}
