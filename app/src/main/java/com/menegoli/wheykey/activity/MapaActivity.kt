package com.menegoli.wheykey.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.menegoli.wheykey.R
import com.menegoli.wheykey.model.Maquina
import kotlinx.android.synthetic.main.mapa_fragment.*

class MapaActivity : AppCompatActivity(), OnMapReadyCallback {
    val machine = Maquina(-22.9722666,-46.9902287, "Machine 1")
    val machine2 = Maquina(-22.9730409,-46.9987857, "Machine 2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapa_fragment)

        val mapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)


    }

    override fun onMapReady(map: GoogleMap?) {
        map?.addMarker(
            MarkerOptions().position(LatLng(machine.latitude, machine.longitude))
                .title(machine.machineName)
        )

        map?.addMarker(
            MarkerOptions().position(LatLng(machine2.latitude, machine2.longitude))
                .title(machine2.machineName)
        )

        map?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(machine.latitude, machine.longitude), 15f))
    }

}