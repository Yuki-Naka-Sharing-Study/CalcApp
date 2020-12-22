package jp.techacademy.yuki.naka.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener   {
            val num  = editText1.text.toString()
            val num2 = editText2.text.toString()
            val number : Int = Integer.parseInt(num)
            val number2 : Int = Integer.parseInt(num2)
            val answer = number + number2
        }

        button2.setOnClickListener   {
            val num = editText1.text.toString()
            val num2 = editText2.text.toString()
            val number : Int = Integer.parseInt(num)
            val number2 : Int = Integer.parseInt(num2)
            val answer = number - number2
        }

        button3.setOnClickListener   {
            val num = editText1.text.toString()
            val num2 = editText2.text.toString()
            val number : Int = Integer.parseInt(num)
            val number2 : Int = Integer.parseInt(num2)
            val answer = number * number2
        }

        button4.setOnClickListener    {
            val num = editText1.text.toString()
            val num2 = editText2.text.toString()
            val number : Int = Integer.parseInt(num)
            val number2 : Int = Integer.parseInt(num2)
            val answer = number / number2
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("value",Int)
        startActivity(intent)
      }
    }
