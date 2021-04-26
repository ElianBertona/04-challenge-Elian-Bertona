package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.PageObject;

public class StoreMainLocators extends PageObject {

	public void allowCookies() {
		getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		//getDriver().manage().timeouts().setScriptTimeout(3500, TimeUnit.MILLISECONDS);
		executor.executeScript("arguments[0].click();",
				$(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")));
	}
	
	public void goToFirtCategory() {
		$(By.cssSelector(".styles_subHeaderLeft__1necg > div > button > span")).click();
		$(By.xpath("//a[@href='/hub/garden-and-outdoor-823']")).click();
		getDriver().manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	}
}