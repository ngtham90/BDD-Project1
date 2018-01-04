package serenity_demo.steps.serenity;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://asksqa.com/student/")
public class HomePage extends PageObject {
	

	


	public String get_created_post() {
	
		waitForTitleToAppear("Selenium Vietnam Students – Practise Selenium");
	
		String txt = Serenity.sessionVariableCalled("Title").toString();
		
		String txtz = find(By.xpath("//*/h3/a[contains(text(),'" + txt + "')]")).getText();
		

		
	
		return txtz;

		
	}

}
