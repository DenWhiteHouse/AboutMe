package com.example.aboutme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var nicknameView : TextView
    lateinit var nicknameEdit : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nicknameView = findViewById(R.id.nickname_tag)
        nicknameEdit = findViewById(R.id.nickanme_edit)
    }

    fun addNickname(view : View){
        if(nicknameEdit.text.isNotEmpty() && nicknameEdit.text.isNotBlank()){
            nicknameView.visibility = View.VISIBLE
            nicknameView.setText(nicknameEdit.text)
        }
        else{
            val toast = Toast.makeText(this,getString(R.string.insert_nickname_warning_toast),Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}
