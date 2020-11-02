package pom123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook_loginpage {
	


	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
@FindBy(xpath="//input[@id='pass']")
	private WebElement pwd;
@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
@FindBy(xpath="//span[.='Sign Out']")
private WebElement logout;

public facebook_loginpage(WebDriver driver)	
{
	PageFactory.initElements(driver, this);
}



public void enteremail(String un)
{
	email.sendKeys(un);
}


public void enterpwd(String pwd1)
{
	pwd.sendKeys(pwd1);
}
public void login()
{
	login.click();
}
public void logout()
{
	logout.click();
}


}
//