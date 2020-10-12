package com.menegoli.wheykey.activity

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.menegoli.wheykey.R
import kotlinx.android.synthetic.main.cadastro_page.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_page)

        selectphoto_button.setOnClickListener(){


        val photoIntent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(photoIntent,0)
        }


        buttoncad.setOnClickListener(){
            val name = editTextTextPersonName.text.toString()
            val email = editTextTextEmailAddress.text.toString()
            val password = editTextTextPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this,"Preencha os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //firebase create user
           FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
               .addOnCompleteListener {
                  if(it.isSuccessful){
                      uploadImageToFirebaseStorage()
                      Toast.makeText(this,"Usuário Cadastrado", Toast.LENGTH_SHORT).show()
                      return@addOnCompleteListener
                  }
               }
               .addOnFailureListener {

               }


        }

    }
    var selectedPhotoUri: Uri? = null

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == 0 && resultCode == Activity.RESULT_OK && data != null){
            selectedPhotoUri = data.data
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)
            val bitmapDrawable = BitmapDrawable(bitmap)
            selectphoto_button.setBackgroundDrawable(bitmapDrawable)


        }
    }

    private fun uploadImageToFirebaseStorage(){

    }


}