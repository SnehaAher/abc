package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Test
public class DataProviderDemo {
	
WebDriver driver;
	
	@BeforeSuite
	public void m2()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void m3()
	{
		driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	}
	
  public void login(String username,String pass) throws InterruptedException 
  {
	  
	driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

	Thread.sleep(5000);
	  
  }
  
  @DataProvider(name="logindata")
  public Object[][] datapriverdemo()
  {
	  
	 return new Object[][]
			 {
		 
		 {"deepali","123"},
		 {"prashantd","pras.hant"}
		 
			 };
  }
  
  
}
