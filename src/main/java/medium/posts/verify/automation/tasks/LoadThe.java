package medium.posts.verify.automation.tasks;

import medium.posts.verify.automation.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class LoadThe implements Task {
    private GoogleHomePage googleHomePage;

	@Override
	@Step("{0} load the medium home page")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
            OpenTheBrowser.on(googleHomePage),

            Search.theTerm("medium")
                .into(GoogleHomePage.INPUT_SEARCH),

            OpenTheMedium.homePage()
        );
	}

	public static LoadThe mediumHomePage() {
		return Tasks.instrumented(LoadThe.class);
    }

}
