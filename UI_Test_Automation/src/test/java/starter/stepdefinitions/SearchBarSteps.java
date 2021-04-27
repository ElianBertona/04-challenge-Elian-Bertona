package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.StoreMainLocators;
import net.thucydides.core.annotations.Steps;
import pages.SearchBarComponent;

public class SearchBarSteps {
	
	@Steps
	SearchBarComponent searchBar;
	@Steps
	StoreMainLocators StoreMain;
	
	@When("user search a product in search bar using {string}")
	public void user_search_a_product_using_exact_name(String product) {
		searchBar.typeInSearch(product);
		searchBar.setEnter();
	}
	@When("user type in search bar")
	public void user_type_in_search_bar() {
		searchBar.typeInSearch(" ");
	}
	
	@Then("the user show the {string} in search history in the search bar")
	public void the_user_show_the_product_in_search_history_in_the_search_bar(String product) {
		StoreMain.goToFirtCategory();
		searchBar.productIsPresentInSeachHistory(product);
	} 


	@Then("the user show the suggestions and categories in search bar")
	public void the_user_show_the_sugestions_and_categories_in_search_bar() {
		searchBar.suggestionsAndCategoriesArePresentInSeachBar();
	}
}
