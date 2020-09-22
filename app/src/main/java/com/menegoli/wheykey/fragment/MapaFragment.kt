package com.menegoli.wheykey.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.menegoli.wheykey.R

class MapaFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.mapa_fragment, container, false)
        val activity = activity as Context
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}