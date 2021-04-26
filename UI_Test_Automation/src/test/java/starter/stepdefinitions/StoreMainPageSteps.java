package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import pages.StoreMainPage;

public class StoreMainPageSteps {
	@Steps
	StoreMainPage mainPage;
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		mainPage.openStore();
		mainPage.allowCookies();
	}
}
