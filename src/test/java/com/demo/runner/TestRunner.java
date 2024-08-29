package com.demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\JavaConcept\\bddproject\\src\\main\\resources\\Features",
		glue="com.demo.stepdefinitions",
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 
)
public class TestRunner {

}
