package medium.posts.verify.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class GoogleHomePage extends PageObject {
	public static final Target INPUT_SEARCH = Target.the("The input search")
			.located(By.name("q"));

}
