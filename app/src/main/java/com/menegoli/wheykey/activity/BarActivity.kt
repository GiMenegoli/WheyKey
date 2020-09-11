package com.menegoli.wheykey.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View

class BarActivity: AppCompatActivity (){


    fun searchPage(view: View){
        val intentSearch = Intent(this, SearchActivity::class.java).apply {

        }
        startActivity(intentSearch)
    }

    fun homePage(view: View){
        var intentHome = Intent(this, PerfilActivity::class.java).apply {

        }
        startActivity(intentHome)
    }

    fun buyPage(view: View){
        val intentBuy = Intent(this, CheckoutSelectActivity::class.java).apply {

        }
        startActivity(intentBuy)
    }
}