package com.menegoli.wheykey.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.menegoli.wheykey.R
import com.menegoli.wheykey.model.Machine

class MapaFragment: Fragment() {

    val machine = Machine(-22.9722666, -46.9902287, "Machine 1")
    val machine2 = Machine(-22.9730409, -46.9987857, "Machine 2")


    private var mapFragment: SupportMapFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.mapa_fragment, container, false)

        if (mapFragment == null) {
            mapFragment = SupportMapFragment.newInstance()
            mapFragment?.getMapAsync(OnMapReadyCallback { googleMap ->
                googleMap?.addMarker(
                    MarkerOptions().position(LatLng(machine.latitude, machine.longitude))
                        .title(machine.machineName)
                )

                googleMap?.addMarker(
                    MarkerOptions().position(LatLng(machine2.latitude, machine2.longitude))
                        .title(machine2.machineName)
                )

                googleMap?.moveCamera(
                    CameraUpdateFactory.newLatLngZoom(
                        LatLng(
                            machine.latitude,
                            machine.longitude
                        ), 15f
                    )
                )
            })
        }


        mapFragment?.let {
            childFragmentManager.beginTransaction().replace(R.id.map, it).commit();
        }

        return rootView
    }

}