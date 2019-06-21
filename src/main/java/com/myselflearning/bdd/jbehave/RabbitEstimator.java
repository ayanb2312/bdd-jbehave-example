package com.myselflearning.bdd.jbehave;

import java.util.List;

public interface RabbitEstimator {

    List<Integer> countByMonth(int months);

    void reverse(final List<Integer> rabbits);
}
