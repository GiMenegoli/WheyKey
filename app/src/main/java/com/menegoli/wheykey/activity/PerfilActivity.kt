package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.checkout_page.*
import kotlinx.android.synthetic.main.perfil_page.*

class PerfilActivity : AppCompatActivity()  {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_page)




        buttonConfig.setOnClickListener {
            val configIntent = Intent(applicationContext, SettingsActivity::class.java)
            startActivity(configIntent
            )
        }

        buttonAdquirir.setOnClickListener {
            val checkoutIntent = Intent(applicationContext, AdquirirActivity::class.java)
            startActivity(checkoutIntent)
        }
    }
}