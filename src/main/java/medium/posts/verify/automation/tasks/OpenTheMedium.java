package medium.posts.verify.automation.tasks;

import medium.posts.verify.automation.userinterfaces.GoogleResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class OpenTheMedium implements Task {

	@Override
	@Step("{0} open the medium home page")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
            Click.on(GoogleResultsPage.MEDIUM_RESULT)
        );
	}

	public static OpenTheMedium homePage() {
		return Tasks.instrumented(OpenTheMedium.class);
    }

}
