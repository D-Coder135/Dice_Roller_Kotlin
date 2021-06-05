package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 * */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     * */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
//        println("Your ${dice.numSides} sided dice rolled ${diceRoll}!")
        val luckyNumber = 4

//        if (diceRoll == luckyNumber) {
//            println("You win!")
//        } else if (diceRoll == 1) {
//            println(" So sorry! You rolled a 1. Try again!")
//        } else if (diceRoll == 2) {
//            println(" Sadly! You rolled a 2. Try again!")
//        } else if (diceRoll == 3) {
//            println(" Unfortunately! You rolled a 3. Try again!")
//        } else if (diceRoll == 5) {
//            println("Don't cry! You rolled a 5. Try again!")
//        } else {
//            println("Apologies! You rolled a 6. Try again!")
//        }

        when (diceRoll) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }

        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}