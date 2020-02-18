package Textng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo {
  @BeforeMethod
  public void BM() {
	  System.out.println("in BM");
  }
  
  @Test
  public void t1() {
	  System.out.println("in t1");
  }
  
}
