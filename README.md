# bdd-jbehave-example
This is a learning project for BDD understanding based on JBehave framework. This simple project can help others to understand the BDD with JBehave conceptually and get confidence that how easy this is to implement.

## Introduction

This project will help you to understand BDD framework using JBehave.

The `EstimateRabbitsTest` class configures JBehave for you. It also defines constants that point to three `*.story` files. The class is setup to run all these stories (`STORY_1`, `STORY_2` & `STORY_3`) together.

The `EstimateRabbitsSteps` class helps to configure test steps. These steps actually calls the business logic code with appropriate code for GIVEN-WHEN-THEN.

The `RabbitEstimator` class is the place where business logic code is written. 

## Toolset

In this project, you will use [Apache Maven](https://maven.apache.org/users/index.html), [JBehave](http://jbehave.org/reference/stable/) and [AssertJ](https://joel-costigliola.github.io/assertj/) to implement the requirements. The requirements are documented in three `*.story` files under the `src/test/resources` folder.

## How to use

1. Clone the project to local

2. Understand the main classes as defined in introduction section

3. Go to project folder in command prompt or git bash

4. Verify `mvn clean install` runs all tests successfully.
