package pages;

import locators.StoreMainLocators;
import net.thucydides.core.annotations.Step;

public class StoreMainPage {

	StoreMainLocators StoreHomePageLocator;
	
	@Step
	public void openStore() {
		StoreHomePageLocator.open();
	}
	@Step
	public void allowCookies() {
		StoreHomePageLocator.allowCookies();
	}
}
