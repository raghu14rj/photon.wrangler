package testscripts;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import pom123.facebook_loginpage;


public class facebook_loginscript
{


public WebDriver driver;
///
static 
{
	System.setProperty("webdriver.gecko.driver","./selenium softwares/geckodriver.exe");	
}


@BeforeMethod

public void openappln()
{
 driver= new FirefoxDriver();
driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@AfterMethod

public void closeappln()
{
	driver.quit();
}

@Test
public void test_login()
{

	 facebook_loginpage ps = new facebook_loginpage(driver);
ps.enteremail("8904244206");
ps.enterpwd("Hope@4673#");
ps.login();

}
}

//
