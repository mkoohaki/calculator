package com.example.myfifthapplication

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    var number_string: String = ""
    var number: Float = 0.0F
    var number1: Float = 0.0F
    var number2: Float = 0.0F
    var numberForEqual = 0.0F

    var func: Char = '\u0000'
    var last_func: Char = '\u0000'


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        one.setOnClickListener {
            number_string = number_string + "1"
            screen.setText(number_string)
        }
        two.setOnClickListener {
            number_string = number_string + "2"
            screen.setText(number_string)
        }
        three.setOnClickListener {
            number_string = number_string + "3"
            screen.setText(number_string)
        }
        four.setOnClickListener {
            number_string = number_string + "4"
            screen.setText(number_string)
        }
        five.setOnClickListener {
            number_string = number_string + "5"
            screen.setText(number_string)
        }
        six.setOnClickListener {
            number_string = number_string + "6"
            screen.setText(number_string)
        }
        seven.setOnClickListener {
            number_string = number_string + "7"
            screen.setText(number_string)
        }
        eight.setOnClickListener {
            number_string = number_string + "8"
            screen.setText(number_string)
        }
        nine.setOnClickListener {
            number_string = number_string + "9"
            screen.setText(number_string)
        }
        zero.setOnClickListener {
            number_string = number_string + "0"
            screen.setText(number_string)
        }
        point.setOnClickListener {
            if (!number_string.contains(".")) {
                number_string = number_string + "."
                screen.setText(number_string)
            }
        }

        plus.setOnClickListener {

            if (number_string != "" && number1 == 0.0f) {
                number = number_string.toFloat()
                number1 = number
                func = '+'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = 0.0f
            } else if (number_string != "" && number1 != 0.0f && func == '+') {
                number = number_string.toFloat()
                number2 = number
                number_string = ""
                number = number1 + number2
                screen.setText(number.toString())
                number1 = number
                numberForEqual = number2
                number = 0.0f
                number2 = 0.0f
            } else if (number_string == "" && number1 != 0.0f && numberForEqual != 0.0F && func == '+') {
                number1 = number1 + numberForEqual
                screen.setText(number1.toString())
                func = '+'
                last_func = func
                function.setText(func.toString())
            } else if (number_string == "" && number1 != 0.0f) {
                func = '+'
                function.setText(func.toString())
            }
        }

        minus.setOnClickListener {
            if (number_string != "" && number1 == 0.0f) {
                number = number_string.toFloat()
                number1 = number
                func = '-'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = 0.0f
            } else if (number_string != "" && number1 != 0.0f && func == '-') {
                number = number_string.toFloat()
                number2 = number
                func = '-'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = number1 - number2
                screen.setText(number.toString())
                number1 = number
                numberForEqual = number2
                number = 0.0f
                number2 = 0.0f
            } else if (number_string == "" && number1 != 0.0f && numberForEqual != 0.0F && func == '-') {
                number1 = number1 - numberForEqual
                screen.setText(number1.toString())
                func = '-'
                last_func = func
                function.setText(func.toString())
            } else if (number_string == "" && number1 != 0.0f) {
                func = '-'
                function.setText(func.toString())
            }
        }

        multiply.setOnClickListener {
            if (number_string != "" && number1 == 0.0f) {
                number = number_string.toFloat()
                number1 = number
                func = 'x'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = 0.0f
            } else if (number_string != "" && number1 != 0.0f && func == 'x') {
                number = number_string.toFloat()
                number2 = number
                func = 'x'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = number1 * number2
                screen.setText(number.toString())
                number1 = number
                numberForEqual = number2
                number = 0.0f
                number2 = 0.0f
            } else if (number_string == "" && number1 != 0.0f && numberForEqual != 0.0F && func == 'x') {
                number1 = number1 * numberForEqual
                screen.setText(number1.toString())
                func = 'x'
                last_func = func
                function.setText(func.toString())
            } else if (number_string == "" && number1 != 0.0f) {
                func = 'x'
                function.setText(func.toString())
            }
        }

        div.setOnClickListener {
            if (number_string != "" && number1 == 0.0f) {
                number = number_string.toFloat()
                number1 = number
                func = '÷'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = 0.0f
            } else if (number_string != "" && number1 != 0.0f && func == '÷') {
                number = number_string.toFloat()
                number2 = number
                func = '÷'
                last_func = func
                function.setText(func.toString())
                number_string = ""
                number = number1 / number2
                screen.setText(number.toString())
                number1 = number
                numberForEqual = number2
                number = 0.0f
                number2 = 0.0f
            } else if (number_string == "" && number1 != 0.0f && numberForEqual != 0.0F && func == '÷') {
                number1 = number1 / numberForEqual
                screen.setText(number1.toString())
                func = '÷'
                last_func = func
                function.setText(func.toString())
            } else if (number_string == "" && number1 != 0.0f) {
                func = '÷'
                function.setText(func.toString())
            }
        }

        equal.setOnClickListener {

            if (number_string != "") {
                number = number_string.toFloat()
                if (func == '+') {
                    number = number_string.toFloat()
                    number2 = number
                    last_func = func
                    func = '='
                    function.setText(func.toString())
                    number = number1 + number2
                    screen.setText((number).toString())
                    number_string = ""
                    number1 = number
                    numberForEqual = 0.0F
                    number = 0.0f
                    number2 = 0.0f
                } else if (func == '-') {
                    number = number_string.toFloat()
                    number2 = number
                    last_func = func
                    func = '='
                    function.setText(func.toString())
                    number = number1 - number2
                    screen.setText((number).toString())
                    number_string = ""
                    number1 = number
                    numberForEqual = 0.0F
                    number = 0.0f
                    number2 = 0.0f
                } else if (func == 'x') {
                    number = number_string.toFloat()
                    number2 = number
                    last_func = func
                    func = '='
                    function.setText(func.toString())
                    number = number1 * number2
                    screen.setText((number).toString())
                    number_string = ""
                    number1 = number
                    numberForEqual = 0.0F
                    number = 0.0f
                    number2 = 0.0f
                } else if (func == '÷') {
                    number = number_string.toFloat()
                    number2 = number
                    last_func = func
                    func = '='
                    function.setText(func.toString())
                    number = number1 / number2
                    screen.setText((number).toString())
                    number_string = ""
                    number1 = number
                    numberForEqual = 0.0F
                    number = 0.0f
                    number2 = 0.0f
                }
            }
        }

        ac.setOnClickListener {
            if (number_string != "") {
                number_string = ""
                screen.setText(number_string)
            } else {
                number = 0.0f
                number_string = ""
                number1 = 0.0f
                number2 = 0.0f
                numberForEqual = 0.0F
                func = '\u0000'
                last_func = '\u0000'
                screen.setText(number.toString())
                function.setText(func.toString())
            }
        }

        posneg.setOnClickListener {
            if (number_string.contains("-")) {
                number_string = number_string.replace("-", "")
                screen.setText(number_string)
            } else {
                number_string = "-" + number_string
                screen.setText(number_string)
            }
        }

        percent.setOnClickListener {
            if (number_string != "" && number == 0.0F && number2 == 0.0F) {
                number = number_string.toFloat()
                number = number /100
                number_string = number.toString()
                screen.setText(number_string)
            }
        }

//        rand.setOnClickListener {
//            val random = Random.nextFloat()
//            number_string = random.toString()
//
//            screen.setText(number_string)
//        }
    }

//    override fun onConfigurationChanged(newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//
//        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            screen.text = "portrait"
//        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            screen.text = "landscape"
//        }
//    }
}
