package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        /**this part controls the button. which by clicking you can roll the dice
         * and see the results on screen!
         */
        rollButton.setOnClickListener {
            val rollDice: ImageView = findViewById(R.id.imageView)
            val myDice = Dice(6)
            val diceRoll = myDice.roll()
            rollDice.contentDescription = diceRoll.toString()
            when (diceRoll){
                1 -> rollDice.setImageResource(R.drawable.dice_1)
                2 -> rollDice.setImageResource(R.drawable.dice_2)
                3 -> rollDice.setImageResource(R.drawable.dice_3)
                4 -> rollDice.setImageResource(R.drawable.dice_4)
                5 -> rollDice.setImageResource(R.drawable.dice_5)
                6 -> rollDice.setImageResource(R.drawable.dice_6)

            }

            when (diceRoll){
                1 -> Toast.makeText(this, "Please try again",Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Please try again",Toast.LENGTH_SHORT).show()
                6 -> Toast.makeText(this, "Congratulation! you won",Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Please try again",Toast.LENGTH_SHORT).show()
                5 -> Toast.makeText(this, "Please try again",Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Please try again",Toast.LENGTH_SHORT).show()

            }

        }
    }
}

//the logical operation of how a Dice Roller work!
class Dice(private val numSides: Int) {
    fun roll(): Int{
        return(1..numSides).random()
    }

}