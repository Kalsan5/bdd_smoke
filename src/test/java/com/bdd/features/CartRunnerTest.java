package com.bdd.features;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cart/cart.feature",glue={"com.steps"},
tags="@smoke",
plugin= {"pretty","html:target/cucumber-report.html"})
public class CartRunnerTest{
	
	

}
