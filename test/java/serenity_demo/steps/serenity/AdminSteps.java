package serenity_demo.steps.serenity;

import net.thucydides.core.steps.ScenarioSteps;

public class AdminSteps extends ScenarioSteps{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	LoginPage loginPage;
	AddNewPost addNewPost;
	HomePage homePage;

	public void go_to_login_page() {
	
		loginPage.open();
		
	}


	public void enter_username(String user) {
		
		loginPage.enter_user(user);
	}


	public void enter_pasword(String pass) {
		
		loginPage.enter_pass(pass);
	}

	public void click_on_Login_button() {
		
		loginPage.click_LoginBtn();
	}

	public  String get_title() {

		
		return loginPage.get_title();
	}

	public void go_to_Add_new_post_page() {
		
		addNewPost.open();
	
	}

	public void enter_title(String title) {
	
		addNewPost.set_title(title);
	}

	public void enter_content(String content) {
		
		addNewPost.set_content(content);
	}

	public void add_tag(String tag) {
	
	
		addNewPost.enter_new_tag(tag);
		addNewPost.click_on_Add_button();
	}

	public void add_category(String category) {
		
		addNewPost.select_category(category);
	}


	public void click_on_Publish_button() {

		addNewPost.click_Publish_button();
		
	}


	public void go_to_Home_page() {
		
		homePage.open();
		
	}


	public String get_post() {
		
		return homePage.get_created_post();
	}




}
