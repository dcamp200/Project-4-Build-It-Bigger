package com.udacity.gradle.builditbigger;

import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Project4
 * Created by david on 2016-07-23.
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class JokeButtonClickTest  {

    private static final String JOKE = "Q: What do you call a fake noodle? A: An Impasta!";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);



    @Test
    public void testClick() {
        Log.i(JokeButtonClickTest.class.getSimpleName(), "Running click test...");
        onView(withId(R.id.jokeButton)).perform(click());
        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.jokeView)).check(matches(withText(JOKE)));
    }
}
