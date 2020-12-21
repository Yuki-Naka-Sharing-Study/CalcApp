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

        button1.setOnClickListener  {
            textView.text = editText1.text.toString()
            textView.text = editText2.text.toString()
        }

        button2.setOnClickListener   {
            textView.text = editText1.text.toString()
            textView.text = editText2.text.toString()
        }

        button3.setOnClickListener   {
            textView.text = editText1.text.toString()
            textView.text = editText2.text.toString()
        }

        button4.setOnClickListener   {
            textView.text = editText1.text.toString()
            textView.text = editText2.text.toString()
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)
    }
}