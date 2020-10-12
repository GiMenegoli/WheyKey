package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.adquirir_page.*
import kotlinx.android.synthetic.main.checkout_page.*

class AdquirirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adquirir_page)


        buttonConfirmar.setOnClickListener(){
            Toast.makeText(this, "Plano Contratado com Sucesso!!", Toast.LENGTH_LONG).show()
        }

    }

     fun onRadioButtonClicked(view: View){
        if(view is RadioButton){

        }

    }

    }