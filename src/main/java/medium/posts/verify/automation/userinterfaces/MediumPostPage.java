package medium.posts.verify.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MediumPostPage {
	public static final Target ICON_HOME = Target.the("The icon search")
			.located(By.xpath("//div[@class=\"u-xs-hide js-metabarLogoLeft\"]/a"));

}
