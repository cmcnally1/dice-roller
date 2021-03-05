package com.cmcnally.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cmcnally.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //View binding variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Using View binding to inflate the activity main layout
        binding = ActivityMainBinding.bind(findViewById(R.id.root))

        //Roll button used to roll the dice
        val rollButton: Button = binding.button

        //Changing the roll button text programmatically
        rollButton.text = "Let's Roll"
    }
}