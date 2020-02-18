package Textng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;







public class login1 {
	
//	loginfuction l=new loginfuction();
	WebDriver dr;
	java_cls jobj;
	@BeforeMethod
	public void t() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		 dr = new ChromeDriver();
		 jobj=new java_cls(dr);
		dr.get("http://demowebshop.tricentis.com");
		
	}
	@AfterMethod
	public void m() {
		dr.close();
	}
	
  @Test
  public void f1() {
	  String m=jobj.login("buttam1703@gmail.com", "12345678", dr);
	  System.out.println(m);
  }
  @Test
  public void f2() {
	  String m1=jobj.login("buttam1703@gmail.com", "12345678", dr);
	  System.out.println(m1);
  }
  
}