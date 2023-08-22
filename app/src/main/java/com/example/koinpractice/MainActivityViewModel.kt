package com.example.koinpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    // Creating a variable that could be observed with the ui activity
    val newText: MutableLiveData<String> = MutableLiveData()

    // A function to assign a value for the live variable
    fun getNewText() {
        newText.value = getNewTextFromRepo().name
    }

    // A function to get the data from the repo (using a temporary data class object)
    private fun getNewTextFromRepo() = Item("Ana Item", "$39.99", "Description")

}