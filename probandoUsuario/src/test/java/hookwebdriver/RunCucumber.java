package hookwebdriver;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue="hookwebdriver/definitions",
        tags = "@test_josecito"
       )
public class RunCucumber {
   public RunCucumber()
   {
   }
}
