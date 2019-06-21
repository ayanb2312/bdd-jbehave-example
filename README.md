# bdd-jbehave-example
This is a learning project for BDD understanding based on JBehave framework. This simple project can help others to understand the BDD with JBehave conceptually and get confidence that how easy this is to implement.

## Introduction

This project will challenge your ability to write high-quality code under the pressure of applying testing frameworks that may be unfamiliar. You will get to show off your commitment to excellence, attention to detail, and tenacity.

Please follow the directions carefully and return your work as soon as you are able. The time needed to successfully complete the challenge will depend on your availability and experience. While speed is important, delivering software that is clean and easy understand is more important. I look forward to seeing your finest work.

You can reach me at jcruz@dollartree.com if you have questions or comments.

## Toolset

In this project, you will use [Apache Maven](https://maven.apache.org/users/index.html), [JBehave](http://jbehave.org/reference/stable/) and [AssertJ](https://joel-costigliola.github.io/assertj/) to implement the requirements. The requirements are documented in three `*.story` files under the `src/test/resources` folder. See the [JBehave documentation](http://jbehave.org/reference/stable/parametrised-scenarios.html) to learn how to implement parameterized scenarios.

The `EstimateRabbitsTest` class configures JBehave for you. It also defines constants that point to three `*.story` files. The class is setup to run the `STORY_1` tests by default.

## Assignment

Introduce a class that implements the `RabbitEstimator` interface using a test driven and incremental approach.  Add test steps in `EstimateRabbitsSteps`. Complete the `STORY_1` requirements before adding `STORY_2` to the list of stories in the `EstimateRabbitsTest.storyPath` method. All three story files should run and pass as part of the build when you are done.

## Finish

1. Verify `mvn clean install` runs all tests successfully.

2. Run `mvn clean` to remove the target directory.

3. Archive the project in ZIP format.

4. Send the archive to jcruz@dollartree.com.
