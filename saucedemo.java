package Textng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class saucedemo {
	WebDriver dr;
	int x=0, y=1;
	int[] pn= {2,5};
	
//	launch_browser a=new launch_browser();
	login_saucedemo b= new login_saucedemo();
	add_product_saucedemo c=new add_product_saucedemo();
	verify_product_saucedemo d=new verify_product_saucedemo();
	add_info_saucedemo e= new add_info_saucedemo();
	
	@BeforeClass
	  public void beforeClass() {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		
		 dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		b.login("standard_user", "secret_sauce", dr);
		
//		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[1]")).sendKeys("standard_user");
//		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[2]")).sendKeys("secret_sauce");
//		dr.findElement(By.xpath("//div[@class='login-box']/form[1]/input[3]")).click();
	}
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  c.add_product(pn[x],dr,y);
	  
	  
	  
  }
  
  @Test
  public void verify() {
	  d.verify(c.expname1, c.actpname1, pn[x]);
	  
	  
  }
  @AfterMethod
  public void aftermethod() {
	  if(x<1) {
			dr.findElement(By.xpath("//div[@class='cart_footer']/a[1]")).click();
			x++;
			 }
			 else
					dr.findElement(By.xpath("//div[@class='cart_footer']/a[2]")).click();
	  y++;
  }
 
  
  @Test
  public void verify1() {
	  d.verify(c.expname1, c.actpname1, pn[x]);
	  
	  
  }
  

 

  @AfterClass
  public void afterClass() {
	  
	  e.add_info("balaji", "reddy","123456", dr);
	  
  }

}
