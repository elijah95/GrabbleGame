package com.elijah.game.grabblegame;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;


@RunWith(AndroidJUnit4.class)
public class TestActivity {

    @Rule
    public final ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void navigationTest() throws Exception {
        onView(withId(R.id.newGame)).perform(click());
        onView(withId(R.id.spell)).perform(click());
        onView(allOf(withId(R.id.letter_button_adapter), isDisplayed())).perform(click());
        onView(withId(R.id.spell_button_spell)).perform(click());
        onView(withId(R.id.buy_button_spell)).perform(click());
        onView(withText("Price: 3 score")).perform(click());
        onView(withText("Price: 1 score")).perform(click());
        pressBack();
        onView(withId(R.id.view_pager)).perform(swipeLeft());
        onView(withId(R.id.view_pager)).perform(swipeRight());
        pressBack();
        pressBack();
        onView(withId(R.id.settings)).perform(click());
        onView(withText("Dark Background")).perform(click());
        pressBack();
        onView(withId(R.id.newGame)).perform(click());
        onView(withId(R.id.spell)).perform(click());
        onView(withId(R.id.buy_button_spell)).perform(click());
    }

}


