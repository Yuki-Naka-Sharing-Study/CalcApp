package jp.techacademy.yuki.naka.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*
import org.w3c.dom.Text
import java.lang.Double.parseDouble
import java.lang.Float.parseFloat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener   {
            if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                //「editTextに片方でも何も値が入っていない」場合
                val snackbar = Snackbar.make(textView, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("SNACKBAR", snackbar)
                startActivity(intent)
            } else {
                //「editTextに両方共何か値が入っている」場合
                val num = editText1.text.toString().toDouble()
                val num2 = editText1.text.toString().toDouble()
                val answer = num + num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
        }

        button2.setOnClickListener   {

        }

        button3.setOnClickListener   {

        }

        button4.setOnClickListener    {

        }
    }

    override fun onClick(v: View?) {

      }
    }

private fun Intent.putExtra(s: String, snackbar: Snackbar) {

}
