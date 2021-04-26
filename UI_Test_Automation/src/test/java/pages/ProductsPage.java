package pages;

import locators.ProductsPageLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ProductsPage extends PageObject{

	ProductsPageLocators productsLocators;
	
	@Step
	public void productIsPresentInFirstPlace(String product) {
		productsLocators.productIsPresentInFirtPlace(product);
	}	
	
	/*
	 * @Step public void productIsPresent(String product) {
	 * productsLocators.productIsPresent(product); }
	 */
	
	@Step
	public void productsByCategoryArePresentInTheFirstPlaces(String category) {
		productsLocators.productsByCategory(category);
	}

}

