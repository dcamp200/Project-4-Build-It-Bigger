package com.udacity.gradle.builditbigger;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;
import android.widget.Button;

/**
 * Project4
 * Created by david on 2016-07-23.
 */
public class JokeButtonClickTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mMainActivity;
    private Button mJokeButton;

    public JokeButtonClickTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);
        mMainActivity = getActivity();
        mJokeButton = (Button) mMainActivity.findViewById(R.id.jokeButton);
        //mTextView = (TextView) mClickActvity.findViewById(R.id.click_count_text_view);
    }

    @MediumTest
    public void testClick() {
        Log.i(JokeButtonClickTest.class.getSimpleName(), "Running click test...");
        TouchUtils.clickView(this, mJokeButton);

        assertEquals(1, 1);
    }
}
