package com.example.textinputlayout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val podaneImie = findViewById<TextInputEditText>(R.id.wprImie)
        val podaneNazwisko = findViewById<TextInputEditText>(R.id.wprNazwisko)


        val wyslane = findViewById<Button>(R.id.wyslij)
        if( (podaneImie.text != null) || (podaneNazwisko.text != null)) {
            wyslane.setOnClickListener {
                findViewById<TextView>(R.id.wynikPopr).text = "Dane Poprawne"
            }
        }
        else {
                findViewById<TextView>(R.id.wynikPopr).text = "Wypełnij wszystkie pola"
        }
    }
}

