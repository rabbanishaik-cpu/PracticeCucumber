package RunnerFiles;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\rabba\\IdeaProjects\\PracticeCucumber\\Features\\Login.feature",
        glue = "StepDefinitions")
public class LoginRunner {
}
