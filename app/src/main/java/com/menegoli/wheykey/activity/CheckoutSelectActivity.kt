package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.checkout_select.*

class CheckoutSelectActivity : AppCompatActivity()  {

    var count = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_select)


        buttonGoNfc.setOnClickListener {
            val goNfcIntent = Intent(applicationContext, CheckoutActivity ::class.java)
            startActivity(goNfcIntent)
        }
    }

}