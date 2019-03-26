package com.kelth.myunittest;

import android.app.Activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class ExampleActivityUnitTest {
    @Test
    public void mainAcitivty_instantiated() {
        Activity activity =  Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);
    }
}
