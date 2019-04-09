package medium.posts.verify.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleResultsPage {
	public static final Target MEDIUM_RESULT = Target.the("The medium result")
			.located(By.xpath("//*[contains(text(),'Medium – a place to read and write big ideas and important stories')]"));

}
