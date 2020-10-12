package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.planos_page.*

class PlanoActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.planos_page)

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

        buttonContinuar.setOnClickListener{
            val continuarIntent = Intent(applicationContext, AdquirirActivity::class.java)
            startActivity(continuarIntent)
        }
    }

    }