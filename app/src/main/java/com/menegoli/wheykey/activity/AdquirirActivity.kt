package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.adquirir_page.*
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.checkout_page.*
import kotlinx.android.synthetic.main.checkout_select.*
import kotlinx.android.synthetic.main.perfil_page.*

class AdquirirActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adquirir_page)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButtonDoseUnica = findViewById<RadioButton>(R.id.radioButtonDoseUnica)
        val radioButtonMensal = findViewById<RadioButton>(R.id.radioButtonMensal)
        val radioButtonAnual = findViewById<RadioButton>(R.id.radioButtonAnual)
        val buttonConfirmar = findViewById<Button>(R.id.buttonConfirmar)



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


        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.radioButtonDoseUnica -> radioGroup
                R.id.radioButtonMensal -> radioGroup
                R.id.radioButtonAnual -> radioGroup
            }
        })


        buttonConfirmar.setOnClickListener(){
        var id: Int = radioGroup.checkedRadioButtonId

            if (id!= -1){
                val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)

                val select = "${radio.text}"
                Toast.makeText(applicationContext,"${radio.text} contratado com sucesso!",
                    Toast.LENGTH_LONG).show()

                val result= radioGroup.textDirection.toString()
                val intentBuy = Intent(applicationContext, PerfilActivity::class.java)
                   intentBuy.putExtra("BuyKey", select)
                   startActivity(intentBuy)

            }else{
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show()
            }
        }

    }



    }



