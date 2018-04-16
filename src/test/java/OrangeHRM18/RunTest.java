package OrangeHRM18;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features =".",tags = "@raj",format = {"html:target/CucumberReport"})
public class RunTest {
}
