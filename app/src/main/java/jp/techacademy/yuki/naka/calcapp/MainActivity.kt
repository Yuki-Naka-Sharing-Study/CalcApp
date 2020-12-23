package jp.techacademy.yuki.naka.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.Double.parseDouble
import java.lang.Float.parseFloat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener   {
            val num  = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val answer = num + num2

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", answer)
            startActivity(intent)
        }

        button2.setOnClickListener   {
            val num = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val answer = num - num2

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", answer)
            startActivity(intent)
        }

        button3.setOnClickListener   {
            val num = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val answer = num * num2

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", answer)
            startActivity(intent)
        }

        button4.setOnClickListener    {
            val num = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()
            val answer = num / num2

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", answer)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {

      }
    }
