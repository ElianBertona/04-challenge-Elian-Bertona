package locators;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class SearchBarComponentLocators extends PageObject {

	public void suggestionsAndCategoriesArePresentInSeachBar() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 3);
		assertTrue("The SUGGESTION is not showing",
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector(".Suggestions_root__Lf3Ip > div > div:nth-child(1) > div"))).getText()
						.contains("SUGGESTION"));
		assertTrue("The SUGGESTION is not showing",$(By.cssSelector(".Suggestions_root__Lf3Ip > div > div:nth-child(2) > div")).getText()
						.contains("CATEGORIES"));
	}

	public void productIsPresentInSearchHistory(String productName) {
		showHistory();
		List<WebElement> historyItems = getDriver().findElements(By.cssSelector(".searchbar-results__content > li"));
		String item = "";
		if (historyItems != null) {
			int child = 0;
			for (int x = 0; x < historyItems.size(); x++) {
				child = +1;
				item = $(By.cssSelector("#history-content > li:nth-child(" + child + ") > div > span")).getText()
						.toLowerCase();
				if (item.contains(productName.toLowerCase())) {
					break;
				}
			}
			assertTrue("The product not exist in search history", item.contains(productName.toLowerCase()));
		} else {
			assertTrue("The search history is not showing", false);
		}
	}

	public void typeInSearch(String name) {
		$(By.id("searchbar")).type(name);
	}

	public void setEnter() {
		$(By.id("searchbar")).submit();
		getDriver().manage().timeouts().pageLoadTimeout(8000, TimeUnit.MILLISECONDS);
	}

	public void showHistory() {
		WebElement element = new WebDriverWait(getDriver(), 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("searchbar")));
		element.click();
		getDriver().manage().timeouts().implicitlyWait(2500, TimeUnit.MILLISECONDS);
	}

}
