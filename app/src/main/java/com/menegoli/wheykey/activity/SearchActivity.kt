package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.menegoli.wheykey.R
import com.menegoli.wheykey.fragment.ListaFragment
import com.menegoli.wheykey.fragment.MapaFragment
import kotlinx.android.synthetic.main.bar_page.*
import kotlinx.android.synthetic.main.search_main.*

class SearchActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)


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
        buttonLista.setOnClickListener {
            manageFragment(ListaFragment(), "Lista")
        }

        buttonMapa.setOnClickListener {
            manageFragment(MapaFragment(), "Mapa")
        }

        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer, ListaFragment(),"Lista" ).commit()
    }

    private fun manageFragment(fragment: Fragment, tag: String){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment, tag).commit()
    }


}