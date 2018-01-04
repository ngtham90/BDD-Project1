package serenity_demo.steps.serenity;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://asksqa.com/student/wp-login.php")
public class LoginPage extends PageObject {

	@FindBy(id = "user_login")
	WebElement username;
	
	@FindBy(id = "user_pass")
	WebElement password;
	

	
	@FindBy(name = "wp-submit")
	WebElement loginBtn;
	
	
	
	public void enter_user(String user) {
		
		username.sendKeys(user);
	}

	public void enter_pass(String pass) {
		
		password.sendKeys(pass);
		
	}

	public void click_LoginBtn() {
		
		loginBtn.click();
	}

	public  String get_title() {
	
		waitForTitleToAppear("Dashboard ‹ Selenium Vietnam Students — WordPress");
		return getTitle();
	}





}
