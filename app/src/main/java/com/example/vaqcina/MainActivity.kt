package com.example.vaqcina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var yes:CheckBox
    private lateinit var  no:CheckBox
    private lateinit var vaqcina: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        vaqcina = findViewById(R.id.vaqcina)
        button = findViewById(R.id.button)


        yes.setOnClickListener{
            no.isChecked = !yes.isChecked
        }

        no.setOnClickListener{
            yes.isChecked = !no.isChecked
        }

        button.setOnClickListener() {
            if (no.isChecked) {
                Toast.makeText(this, "თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
            }else if (yes.isChecked && vaqcina.text.toString() == "") {
            Toast.makeText(this, "შეიყვანეთ ვაქცინის დასახელება", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "თქვენ ხართ ვაქცინირებული", Toast.LENGTH_SHORT).show()
            }


        }



    }


}
