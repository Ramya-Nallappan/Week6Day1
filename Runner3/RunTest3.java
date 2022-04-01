package Runner3;

import Steps3.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/Feature3" ,glue="Steps3" ,monochrome=true)
public class RunTest3 extends BaseClass{

}
