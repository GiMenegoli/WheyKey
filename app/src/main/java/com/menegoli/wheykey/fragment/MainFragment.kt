package com.menegoli.wheykey.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.checkout_select.*
import kotlinx.android.synthetic.main.lista_fragment.*
import kotlinx.android.synthetic.main.perfil_page.*


class MainFragment: FragmentActivity() {

    var fragmentA: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main)

        //button.setOnClickListener(){
          // supportFragmentManager.beginTransaction().add(R.id., ListaFragment(), "Lista").commit()

       // }
        button2.setOnClickListener(){
            supportFragmentManager.beginTransaction().add(R.id.map, MapaFragment(), "Mapa").commit()
        }

        val fragmentA = ListaFragment()
        supportFragmentManager.beginTransaction().add(R.id.map, fragmentA, "Lista").commit()
        val fragmentTrasaction: MapaFragment
    }

}