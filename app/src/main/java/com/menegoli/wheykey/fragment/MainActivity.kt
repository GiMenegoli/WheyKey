package com.menegoli.wheykey.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.search_main.*

class MainActivity: AppCompatActivity() {


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