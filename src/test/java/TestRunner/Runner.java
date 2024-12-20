package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Magento_AccountCreation&Login.feature",
glue="org.stepdefinition",
dryRun=false,
tags="@signIN"
)
public class Runner {

}
