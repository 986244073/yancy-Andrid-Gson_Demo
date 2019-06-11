package com.android.gson_demo;

import android.util.Log;

import com.google.gson.Gson;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
        Gson gson = new Gson();
        Employee employee = new Employee("yc",30,"qq");
        String s = gson.toJson(employee);
        Log.d("qq", "onCreate: "+s);
    }
}