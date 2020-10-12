package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.adquirir_page.*
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.checkout_select.*

class CheckoutSelectActivity : AppCompatActivity()  {

    var count = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_select)

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

        buttonGoNfc.setOnClickListener(){
            var idSabor: Int = groupSabor.checkedRadioButtonId
            var idCopo: Int = groupCopo.checkedRadioButtonId
            var idComplemento: Int = groupComplemento.checkedRadioButtonId
            if (idSabor!= -1 && idCopo!= -1 && idComplemento!= -1 ){

                val goNfcIntent = Intent(applicationContext, CheckoutActivity ::class.java)
                startActivity(goNfcIntent)
            }else{
                Toast.makeText(this, "Selecione os campos", Toast.LENGTH_LONG).show()
            }
        }
    }

}