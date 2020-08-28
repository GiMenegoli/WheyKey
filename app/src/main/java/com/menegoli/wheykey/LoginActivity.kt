package com.menegoli.wheykey

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.os.Build
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        var email = findViewById<EditText>(R.id.email)
        var pass = findViewById<EditText>(R.id.pass)
        var login = findViewById<Button>(R.id.login)

        login.setOnClickListener(){
            val user_name = email.text;
            val password = pass.text;
            Toast.makeText(this, user_name, Toast.LENGTH_LONG).show()
        }
    }
}
