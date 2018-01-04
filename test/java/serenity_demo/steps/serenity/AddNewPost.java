package serenity_demo.steps.serenity;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://asksqa.com/student/wp-admin/post-new.php")
public class AddNewPost extends PageObject{

	WebElementFacade title;
	
	@FindBy(id = "new-tag-post_tag")
	WebElement tagtxt;
	
	
	@FindBy(xpath = "//*[@id=\"post_tag\"]/div/div[2]/p/input[2]")
	WebElement addBtn;
	
	
	WebElementFacade publish;
	
	public void set_title(String txt) {
	
	
		Serenity.setSessionVariable("Title").to(txt);
		title.sendKeys(txt);
	
	}

	public void set_content(String content) {

		getDriver().switchTo().frame("content_ifr");
		find(By.cssSelector("#tinymce")).sendKeys(content);
		getDriver().switchTo().defaultContent();
		
		
	}


	public void enter_new_tag(String tag) {
		
		tagtxt.sendKeys(tag);
	}

	public void click_on_Add_button() {
	
		addBtn.click();
	}

	public void select_category(String category) {
		
		find(By.xpath("//label[contains(text(),'" + category + "')]/input")).click();
	}

	public void click_Publish_button() {
		
		waitFor(publish);
		
		
		
	if(publish.getAttribute("value").equalsIgnoreCase("publish")) {
		publish.click();
	}


			
			
		}
		
		
	}




