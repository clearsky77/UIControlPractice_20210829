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

//      받은 메시지를 텍스트 뷰로 화면에 반영하기
        copyMessageBtn.setOnClickListener {
//            입력한 내용 변수에 저장
            val inputMessage = messageEdt.text.toString()
//            텍스트 뷰의 text 속성에 내용을 대입(set)
            messageText.text = inputMessage

        }

    }
}