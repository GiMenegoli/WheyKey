package com.menegoli.wheykey

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.os.Build
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.login_page.*

class LoginActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        login.setOnClickListener(){
            val user_name = email.text;
            val user_password = pass.text;
            Toast.makeText(this, user_name, Toast.LENGTH_LONG).show()
            //this.startActivity(Intent(this, PerfilActivity.class))
            //Intent intent = new Intent(this, PerfilActivity.class)

        }

       fun irParaHome(view: View){
           val intentHome = Intent(this, PerfilActivity::class.java).apply {
           }
           startActivity(intentHome)
       }
        fun irParaCadastro(view: View){
            val intentCad = Intent(this, CadastroActivity::class.java).apply{

            }
            startActivity(intentCad)
        }
    }


}
