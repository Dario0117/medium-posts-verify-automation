package medium.posts.verify.automation.stepdefinitions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import medium.posts.verify.automation.models.Post;
import medium.posts.verify.automation.tasks.LoadThe;
import medium.posts.verify.automation.tasks.Search;
import medium.posts.verify.automation.userinterfaces.MediumHomePage;
import medium.posts.verify.automation.userinterfaces.MediumPostPage;
import medium.posts.verify.automation.userinterfaces.MediumResultsPage;
import medium.posts.verify.automation.utils.FileManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;

public class MediumPostsInformationStepDefinition {

    @Managed()
    private WebDriver hisBrowser;
    private Actor esteban = Actor.named("Esteban");

    @Before
    public void setUp() {
        esteban.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the medium home page loaded$")
    public void theMediumHomePageLoaded() {
        esteban.wasAbleTo(
            LoadThe.mediumHomePage()
        );
    }

    @When("^i search the posts stored in a excel file$")
    public void iSearchThePostsStoredInAExcelFile() {
        List<Post> posts = FileManagement.readExcel();
        for (Post post : posts) {
            esteban.attemptsTo(Click.on(MediumHomePage.ICON_SEARCH),

                    Search.theTerm(post.getTitle()).into(MediumHomePage.INPUT_SEARCH),

                    WaitUntil.the(MediumResultsPage.RESULT_SEARCH_BOX, isCurrentlyVisible()),

                    Click.on(MediumResultsPage.FOUNDED_RESPONSE),

                    WaitUntil.the(MediumPostPage.ICON_HOME, isCurrentlyVisible()),

                    Click.on(MediumPostPage.ICON_HOME));
        }
    }

    @Then("^the information about each post should be the same$")
    public void theInformationAboutEachPostShouldBeTheSame() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
