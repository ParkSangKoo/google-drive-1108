package google.drive.psk.main;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber"},
                features = "src/test/resources/features",
                extraGlue="google.drive.psk/common")
public class TestMain {
    
}
