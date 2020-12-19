package jp.techacademy.yuki.naka.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            textView.text = editText1.text.toString()
        }

        button2.setOnClickListener {
            // EditTextの文字列をTextViewに設定
            textView.text = editText2.text.toString()
        }
    }
}