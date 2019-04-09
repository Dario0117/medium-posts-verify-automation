package medium.posts.verify.automation.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/medium_posts_information.feature",
        glue="medium.posts.verify.automation.stepdefinitions",
        snippets=SnippetType.CAMELCASE,
        monochrome = true)
public class MediumPostsInformation {}
