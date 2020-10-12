package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.checkout_page.*
import kotlinx.android.synthetic.main.perfil_page.*

class PerfilActivity : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_page)


        val result = intent.getStringExtra("BuyKey")
        val textPlan = findViewById<TextView>(R.id.textPlan)
        textPlan.text = result

        val cont = intent.getStringExtra("ContadorDose")
        val qtdDoses = findViewById<TextView>(R.id.qtdDoses)
        qtdDoses.text = cont


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
        buttonConfig.setOnClickListener {
            val configIntent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(configIntent
            )
        }
        buttonAdquirir.setOnClickListener {
            val checkoutIntent = Intent(applicationContext, PlanoActivity::class.java)
            startActivity(checkoutIntent)
        }

        imageButtonLog.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val logIntent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(logIntent)
        }
    }

}