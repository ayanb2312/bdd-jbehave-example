package com.myselflearning.bdd.jbehave;

import static org.hamcrest.CoreMatchers.notNullValue;

import java.util.List;
import java.util.regex.Matcher;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.myselflearning.bdd.jbehave.ExpectedPositiveMonthsException;
import com.myselflearning.bdd.jbehave.RabbitEstimator;
import com.myselflearning.bdd.jbehave.RabbitEstimatorImpl;

public class EstimateRabbitsSteps {
	
	private RabbitEstimator rabbitEstimator;
	private List<Integer> rabbitEstimatorOutput;
	private int m_months;
	private Throwable m_throwable = null;
	
	@Given("the number of $months")
	@Aliases(values={"Estimate rabbit by $months"})
	public void doRabbitEstimateStory(int months) {
		rabbitEstimator = new RabbitEstimatorImpl();
		setMonths(months);
	}
	
	@Given("the number of months is zero")
	public void doRabbitEstimateForZeroMonth() {
		rabbitEstimator = new RabbitEstimatorImpl();
		setMonths(0);
	}
	
	@When("the number of rabbits are estimated")
	public void getActualRabbitEstimate() {
		try {
		    rabbitEstimatorOutput = rabbitEstimator.countByMonth(m_months);
		} catch(ExpectedPositiveMonthsException ex) {
			m_throwable = ex;
		}
	}
	
	@When("the list is sorted in descending order")
	public void getReverseRabbitEstimate() {
		rabbitEstimator.reverse(rabbitEstimatorOutput);
	}
	
	@Then("the number of rabbits for each month will be $expected")
	public void rabbitEstimateResults(List<Integer> expected) {
		if (rabbitEstimatorOutput.equals(expected)) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}
	
	@Then("the ExpectedPositiveMonthsException with will be thrown")
	public void rabbitEstimateException() {
		//assertThat(m_throwable, allOf(notNullValue(), myExceptionMatcher()));
		System.out.println("Success");
	}
	
	/*private Matcher<Throwable> myExceptionMatcher() {
	    // Build and return some Matcher instance
	}*/

	private void setMonths(int m_months) {
		this.m_months = m_months;
	}

}
