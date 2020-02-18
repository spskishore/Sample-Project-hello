package Textng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add_product_saucedemo {
	 String expname1,actpname1;
	
	public void add_product(int pn,  WebDriver dr, int y)
	{
		 expname1=dr.findElement(By.xpath("//div[@class='inventory_list']/div["+pn+"]/div[2]/a/div")).getText();
//		 expname2=dr.findElement(By.xpath("//div[@class='inventory_list']/div["+q+"]/div[2]/a/div")).getText();

		dr.findElement(By.xpath("//div[@class='inventory_list']/div["+pn+"]/div[3]/button")).click();
//		dr.findElement(By.xpath("//div[@class='inventory_list']/div["+q+"]/div[3]/button")).click();

		dr.findElement(By.xpath("//div[@class='shopping_cart_container']/a")).click();
		 actpname1=dr.findElement(By.xpath("//div[@class='cart_item']["+y+"]/div[2]/a/div")).getText();
//		 actpname2=dr.findElement(By.xpath("//div[@class='cart_item']["+q+"]/div[2]/a/div")).getText();
		 
		 


		
	}
	

}
