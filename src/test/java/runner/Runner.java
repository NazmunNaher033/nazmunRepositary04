package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Runner {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src\\test\\resources\\features"},
            glue = {"stepDefinitions"},
            //tags = ("@Employee"),
            monochrome = false,
            dryRun = false,

            plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json"}
    )

    public class Runner1 {

    }
}