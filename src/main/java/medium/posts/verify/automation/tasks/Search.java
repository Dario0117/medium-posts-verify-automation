package medium.posts.verify.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Search implements Task {

    private String term;
    private Target target;

	public Search(String term) {
		this.term = term;
    }

	@Override
	@Step("{0} search the '#term'")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
            Enter.theValue(this.term + "\n")
            .into(this.target)
        );
	}

	public static Search theTerm(String term) {
		return Tasks.instrumented(Search.class, term);
    }
    
    public Search into(Target target) {
        this.target = target;
        return this;
    }

}
