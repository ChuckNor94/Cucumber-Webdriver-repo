package com.cucumber.MavenCucumberPrototype2;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "src/test/resource"
		)

public class RunnerTest {

}
