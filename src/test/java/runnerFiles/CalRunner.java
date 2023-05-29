package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\PracticePrograms\\Cucumber_Hooks\\src\\test\\resources\\featurefiles\\Calculation.feature",
                  glue= {"stepDefinations"},
                  plugin= {"pretty"})
public class CalRunner {
	
	

}
