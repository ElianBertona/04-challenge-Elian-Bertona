package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pages.ProductsPage;

public class ProductPageSteps {

	@Steps
	ProductsPage productsPage;
	
	
	@Then("the user show the {string} in first place in the products page")
	public void the_user_show_the_product_in_first_place__in_product_page(String product) {
		productsPage.productIsPresentInFirstPlace(product);
	}
	
	@Then("the user show products by {string} in the products page")
	public void the_user_show_products_by_category_in_the_first_places_in_product_page(String category) {
		productsPage.productsByCategoryArePresentInTheFirstPlaces(category);
	} 
}
