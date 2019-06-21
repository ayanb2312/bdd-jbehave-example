package com.myselflearning.bdd.jbehave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RabbitEstimatorImpl implements RabbitEstimator{

	@Override
	public List<Integer> countByMonth(int months) {
		if(months == 0) {
			throw new ExpectedPositiveMonthsException("Input months has to be positive number and more than 0.");
		}
		
		List<Integer> rabbitList = new ArrayList<Integer>();
		int cursor = 2;
		int incrementor = 0;
		
		rabbitList.add(cursor);
		for(int i=1; i<months; i++) {
			incrementor = incrementor + cursor;
		    cursor = incrementor;
		    rabbitList.add(incrementor);
		}

		return rabbitList;
	}

	@Override
	public void reverse(List<Integer> rabbits) {
		Collections.reverse(rabbits);
	}

}
