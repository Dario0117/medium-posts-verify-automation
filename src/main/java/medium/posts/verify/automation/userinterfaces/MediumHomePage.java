package medium.posts.verify.automation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MediumHomePage {
	public static final Target ICON_SEARCH = Target.the("The icon search")
			.located(By.xpath("//span[@class=\"svgIcon svgIcon--search svgIcon--25px u-baseColor--iconLight\"]"));
    public static final Target INPUT_SEARCH = Target.the("The input search")
			.located(By.xpath("//input[@class=\"js-predictiveSearchInput textInput textInput--rounded textInput--darkText u-baseColor--textNormal textInput--transparent\"]"));

}
