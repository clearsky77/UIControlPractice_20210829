package com.example.uicontrolpractice_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//    메시지를 받아와서 토스트로 띄워준다.
        toastBtn.setOnClickListener {
            var inputMessage = messageEdt.text.toString()
            Toast.makeText(this, inputMessage, Toast.LENGTH_SHORT).show()

        }


    }




}