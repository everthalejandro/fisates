package runner;

import com.fisa.group.test.utils.BeforeSuite;
import com.fisa.group.test.utils.RunnerPersonalizado;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static com.fisa.group.test.stepdefinitions.ParameterDefinitionsStatics.loadProperties;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/Himno.feature",
        glue = "com.fisa.group.test.stepdefinitions"
)

public class ejecutor {
    @BeforeSuite
    public static void setup() {
        loadProperties();
    }
}