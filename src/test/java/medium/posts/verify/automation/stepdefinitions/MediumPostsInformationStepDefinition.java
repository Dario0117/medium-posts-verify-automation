package medium.posts.verify.automation.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import medium.posts.verify.automation.tasks.OpenTheBrowser;
import medium.posts.verify.automation.userinterfaces.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class MediumPostsInformationStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
    private Actor esteban = Actor.named("Esteban");
    private GoogleHomePage googleHomePage;

	@Before
	public void setUp() {
		esteban.can(BrowseTheWeb.with(hisBrowser));
    }
    
    @Given("^the medium home page loaded$")
    public void theMediumHomePageLoaded() {
		esteban.wasAbleTo(OpenTheBrowser.on(googleHomePage));
    }

    @When("^i search the posts stored in a excel file$")
    public void iSearchThePostsStoredInAExcelFile() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the information about each post should be the same$")
    public void theInformationAboutEachPostShouldBeTheSame() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
