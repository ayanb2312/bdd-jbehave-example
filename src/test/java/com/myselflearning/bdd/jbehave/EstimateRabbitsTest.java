package com.myselflearning.bdd.jbehave;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;

@RunWith(JUnitReportingRunner.class)
public class EstimateRabbitsTest extends JUnitStories {

    private static final String STORY_1 = "com/myselflearning/bdd/jbehave/validate-months.story";
    private static final String STORY_2 = "com/myselflearning/bdd/jbehave/estimate-rabbits.story";
    private static final String STORY_3 = "com/myselflearning/bdd/jbehave/reverse-list.story";

    @Override
    public Configuration configuration() {
        final MostUsefulConfiguration configuration = new MostUsefulConfiguration();
        configuration.usePendingStepStrategy(new FailingUponPendingStep());
        return configuration.useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats()
                .withFormats(Format.CONSOLE, Format.TXT));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new EstimateRabbitsSteps());
    }

    @Override
    protected List<String> storyPaths() {
    	List<String> storyList = new ArrayList<String>();
    	storyList.add(STORY_1);
    	storyList.add(STORY_2);
    	storyList.add(STORY_3);
        //return asList(STORY_1);
    	return storyList;
    }

}
