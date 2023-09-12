package kr.hs.emirim.evie.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var btnMain : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rg : RadioGroup = findViewById(R.id.rg)

        btnMain = findViewById(R.id.btnMain)
        var intent = Intent(applicationContext, SecondActivity::class.java)
        btnMain.setOnClickListener {
            if(rg.checkedRadioButtonId == R.id.rbSecond){
                intent = Intent(applicationContext, SecondActivity::class.java)
            }else {
                intent = Intent(applicationContext, ThirdActivity::class.java)
            }
            startActivity(intent)
        }
    }
}