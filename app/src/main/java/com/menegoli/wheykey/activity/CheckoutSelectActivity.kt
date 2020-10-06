package com.menegoli.wheykey.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.checkout_select.*

class CheckoutSelectActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout_select)


        buttonGoNfc.setOnClickListener {
            val goNfcIntent = Intent(applicationContext, CheckoutActivity ::class.java)
            startActivity(goNfcIntent)
        }


    }
}