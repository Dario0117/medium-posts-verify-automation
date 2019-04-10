package medium.posts.verify.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MediumResultsPage {
	public static final Target FOUNDED_RESPONSE = Target.the("The response post")
			.located(By.xpath("//h3"));
    public static final Target RESULT_SEARCH_BOX = Target.the("The result search box")
			.located(By.xpath("//input[@class=\"js-searchInput textInput textInput--jumbo textInput--underlined\"]"));
}
