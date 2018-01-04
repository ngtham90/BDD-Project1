package serenity_demo.steps.serenity;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

	@Steps
	AdminSteps adminStep;
	
	@Given("^login with account \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void login_with_account_and_password_as(String user, String pass) throws Exception {
	 
		adminStep.go_to_login_page();
		adminStep.enter_username(user);
		adminStep.enter_pasword(pass);
		adminStep.click_on_Login_button();
		
	}


	@Then("^admin is on Home page and get title page is \"([^\"]*)\"$")
	public void admin_is_on_Home_page_and_get_title_page_is(String title) throws Exception {
	 
		Assert.assertEquals(title, adminStep.get_title());
	}

	@When("^admin goto Create new post page$")
	public void admin_goto_Create_new_post_page() throws Exception {
	 
		adminStep.go_to_Add_new_post_page();
	}

	@When("^admin enter Title as \"([^\"]*)\"$")
	public void admin_enter_Title_as(String title) throws Exception {

		adminStep.enter_title(title);
	}

	@When("^admin add content as \"([^\"]*)\"$")
	public void admin_add_content_as(String content) throws Exception {

		adminStep.enter_content(content);
	}

	@When("^admin add tags as \"([^\"]*)\"$")
	public void admin_add_tags_as(String tag) throws Exception {

		adminStep.add_tag(tag);
	}

	@When("^admin add categories as \"([^\"]*)\"$")
	public void admin_add_categories_as(String category) throws Exception {
	  
		adminStep.add_category(category);
	}

	@When("^admin save new post$")
	public void admin_save_new_post() throws Exception {
	
		adminStep.click_on_Publish_button();
	}

	@When("^admin goto Home page$")
	public void admin_goto_Home_page() throws Exception {
	 
		adminStep.go_to_Home_page();
	}

	@Then("^admin should see new post displayed on home page$")
	public void admin_should_see_new_post_displayed_on_home_page() throws Exception {
		String title = Serenity.sessionVariableCalled("Title").toString();
	   
		Assert.assertEquals(title, adminStep.get_post());
	}

}