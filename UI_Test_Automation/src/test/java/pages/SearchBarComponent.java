package pages;

import locators.SearchBarComponentLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class SearchBarComponent extends PageObject{
	
	SearchBarComponentLocators searchbar;

	@Step
	public void typeInSearch(String name) {
		searchbar.typeInSearch(name);
	}

	@Step
	public void setEnter() {
		searchbar.setEnter();
	}	
	
	@Step
	public void productIsPresentInSeachHistory(String product) {
		searchbar.productIsPresentInSearchHistory(product);
	}	
}