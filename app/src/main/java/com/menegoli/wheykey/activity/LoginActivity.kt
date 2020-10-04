package com.menegoli.wheykey.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.login_page.*

class LoginActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        login.setOnClickListener(){
            val user_name = email.text;
            val user_password = Password.text;
            Toast.makeText(this, user_name, Toast.LENGTH_LONG).show()
            //this.startActivity(Intent(this, PerfilActivity.class))
            val perfilIntent = Intent(applicationContext, PerfilActivity::class.java)
            startActivity(perfilIntent)
            //Intent intent = new Intent(this, PerfilActivity.class)

        }

        buttonCadastro.setOnClickListener {
            val cadIntent = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(cadIntent)
        }


    }


}
