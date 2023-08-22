package com.example.koinpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.koinpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // layout binding variable (XML view binding ) @build.gradle(app):10-12
    private lateinit var b: ActivityMainBinding
    // initializing the view model of the activity with by lazy so it's only created once
    private val viewModel: MainActivityViewModel by lazy {
        ViewModelProvider(this)[MainActivityViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setting the view using view binding
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        // setting on click listener for the button to update the text
        b.btnChangeText.setOnClickListener {
            // calling view model functions that we moved to the view model to let it handle the data to separate it from the ui activity
            viewModel.getNewText()
            viewModel.newText.observe(this) { s ->
                // changing the text view value with the temporary holder obj (item)
                b.tvNameHolder.text = s
            }
        }
    }
}