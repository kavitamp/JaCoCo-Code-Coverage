package com.android.jacococodecoverage.exclude

import android.util.Log

/*
This class is created to test does exclude package from code coverage functionality
 */
class CommonClass {
    fun testingFunction() {
        val a = 10
        val b = 20
        val c = a + b
        Log.d("testingCodeCoverage", "c->$c")
    }
}