package com.dekow.testingandriod

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilsTest{



    @Test
    fun `valid user and correctly repeated password return true`(){
        val result = RegistrationUtils.validateRegistrationInput(
            "mohamed",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `user already exist return false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            "moha",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `empty fields return false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            " ",
            " ",
            " "
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `password wasn't repeated correctly return false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            "moha",
            "12345",
            "123"
        )

        assertThat(result).isFalse()
    }


    @Test
    fun `password contains less than 2 digits return false`(){
        val result = RegistrationUtils.validateRegistrationInput(
            "moha",
            "1MM",
            "1MM"
        )

        assertThat(result).isFalse()
    }

}