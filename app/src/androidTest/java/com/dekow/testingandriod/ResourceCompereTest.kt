package com.dekow.testingandriod

import android.app.Application
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceCompereTest{

    private lateinit var resourceCompere: ResourceCompere

    @Before
    fun setup(){
        resourceCompere = ResourceCompere()
    }


    @After
    fun teardown(){
        //destroys the objects after the test is over
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceCompere.isEqual(context, "TestingAndriod", R.string.app_name, )

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentFromGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceCompere.isEqual(context, "Testing app", R.string.app_name, )

        assertThat(result).isFalse()
    }


    //git working test
}