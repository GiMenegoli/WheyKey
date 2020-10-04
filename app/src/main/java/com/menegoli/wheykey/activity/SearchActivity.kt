package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.menegoli.wheykey.R
import com.menegoli.wheykey.fragment.ListaFragment
import com.menegoli.wheykey.fragment.MapaFragment
import kotlinx.android.synthetic.main.search_main.*

class SearchActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)


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