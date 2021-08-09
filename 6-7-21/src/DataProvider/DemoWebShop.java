package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {
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
		driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	}
	
  @Test(dataProvider = "logindata")
  public void login(String username,String pass) throws InterruptedException 
  {
	  
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(username);
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
	driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	Thread.sleep(5000);
	  
  }
  
  @DataProvider(name="logindata")
  public Object[][] datapriverdemo()
  {
	  
	 return new Object[][]
			 {
		 
		 {"snehalaher11596@gmail.com","123snehal"},
		 {"sneh","321snehal"},
		 {"WebAs@gmail.com","123AshuA"},
		 {"Webport@gmail.com","Web@123"},
		 {"webxyz@gmail.com","Xyz@123"}
			 
  };
  
  }
}
