package com.bdd.features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cart/cart.feature",glue={"com.steps"})

public class cartRunner {
	
	

}
