package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.adquirir_page.*
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.checkout_page.*
import kotlinx.android.synthetic.main.checkout_select.*

class AdquirirActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adquirir_page)

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

        buttonConfirmar.setOnClickListener(){
        var id: Int = groupSabor.checkedRadioButtonId

            if (id!= -1){
                val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
                Toast.makeText(applicationContext,"${radio.text} contratado com sucesso!",
                    Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show()
            }
        }
    }



    }

