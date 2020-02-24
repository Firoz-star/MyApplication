package com.example.firozshaikh.myapplication;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mActivityTestRule.getActivity();
    }

    @Test
    public void testLunch(){

        View view = mainActivity.findViewById(R.id.button);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        mainActivity = null;
    }
}