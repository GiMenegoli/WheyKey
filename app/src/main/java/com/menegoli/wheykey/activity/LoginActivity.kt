package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuth.AuthStateListener
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.cadastro_page.*
import kotlinx.android.synthetic.main.login_page.*


class LoginActivity : AppCompatActivity() {

    private val TAG = "LoginActivity"
    private lateinit var mAuth: FirebaseAuth
    //variaveis locais

    private var email: String? = null
    private var password: String? = null
    private var mAuthListener: AuthStateListener? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)
        mAuth = FirebaseAuth.getInstance();


        btn_login.setOnClickListener(){
            val email = et_email.text.toString()
            val password = et_password.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Preencha os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener{
                    if(it.isSuccessful) {
                        val perfilIntent = Intent(applicationContext, PerfilActivity::class.java)
                        startActivity(perfilIntent)
                    }

                    }
                .addOnFailureListener {
                    Toast.makeText(this,"Usuário e senha Inválido", Toast.LENGTH_SHORT).show()
                }
                }




        buttonCadastro.setOnClickListener {
            val cadIntent = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(cadIntent)
        }
    }


}
