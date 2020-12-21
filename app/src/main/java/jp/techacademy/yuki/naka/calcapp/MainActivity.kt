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
            // EditTextの文字列をTextViewに設定
            textView.text = this.toString()
        }

        button2.setOnClickListener   {
            // EditTextの文字列をTextViewに設定
            textView.text = this.toString()
        }

        button3.setOnClickListener   {
            // EditTextの文字列をTextViewに設定
            textView.text = this.toString()
        }

        button4.setOnClickListener   {
            // EditTextの文字列をTextViewに設定
            textView.text = this.toString()
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)
    }
}