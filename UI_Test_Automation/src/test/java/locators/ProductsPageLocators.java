package locators;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class ProductsPageLocators extends PageObject {

	String productName;

	public void productIsPresentInFirtPlace(String name) {
		assertTrue("The product is not visible in the page",
				$(By.cssSelector(".ListingLayout_products__NwzPC > a")).isCurrentlyVisible());
		assertTrue("The product do no contains the name espected",
				$(By.cssSelector(".ListingLayout_products__NwzPC > a > div > div")).getText().toLowerCase().contains(name.toLowerCase()));
	}

	
	public void productsByCategory(String category) {
		List<WebElement> products = getDriver().findElements(By.cssSelector(".ListingLayout_products__NwzPC > a"));
		String product="";
		if (products != null) {
			for (int x = 0; x < products.size()-1; x++) {
				int child = x + 1;
				 product = products.get(x)
						.findElement(By.cssSelector(":nth-child(" + child + ") > div > div")).getText().toLowerCase();
				if(!product.contains(category.toLowerCase())){
					break;
				}
			}
			assertTrue("This product not match with the category: " + product,product.contains(category.toLowerCase()));
		}
	}

}
