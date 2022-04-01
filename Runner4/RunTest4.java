package Runner4;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/Feature4" ,glue="Steps4" ,monochrome=true)

public class RunTest4 extends AbstractTestNGCucumberTests {

}
