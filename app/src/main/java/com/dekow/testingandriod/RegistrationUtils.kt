package com.dekow.testingandriod

object RegistrationUtils {

/****
what can make the test fail
****/

/***

    //all the field are empty
    //password !== confirmPassword
    //password doesn't contains at least 2 digits
    //user name taken
*/

private val takenUserNames = listOf("moha", "dek")


    fun validateRegistrationInput(
        name: String,
        password: String,
        confirmPassword: String
    ): Boolean{

        if (name.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        if (password != confirmPassword){
            return false
        }
        if (name in takenUserNames){
            return false
        }
        if (password.count { char -> char.isDigit() } < 2){
            return false
        }
        return true
    }
}