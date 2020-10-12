package com.menegoli.wheykey.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.cadastro_page.*
import kotlinx.android.synthetic.main.settings_page.*


class SettingsActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_page)


        buttonHome.setOnClickListener {
            val homeIntent = Intent(applicationContext, PerfilActivity::class.java)
            startActivity(homeIntent)
        }
        buttonSearch.setOnClickListener {
            val searchIntent = Intent(applicationContext, SearchActivity::class.java)
            startActivity(searchIntent)
        }
        buttonBuy.setOnClickListener {
            val buyIntent = Intent(applicationContext, CheckoutSelectActivity::class.java)
            startActivity(buyIntent)

        }
        buttonSave.setOnClickListener{
            val numberCard = editTextNumber.text.toString()
            val validate = editTextDate.text.toString()
            val codValidate = editTextCVV.text.toString()
            val nameCard = editTextTextPersonNameCard.text.toString()
            val documentCard = editTextNumberDocumentNumber.text.toString()

            if(numberCard.isEmpty() || validate.isEmpty() || codValidate.isEmpty() || nameCard.isEmpty() || documentCard.isEmpty()){
                Toast.makeText(this,"Preencha os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this,"Informações cadastradas", Toast.LENGTH_SHORT).show()
            }

        }
}

