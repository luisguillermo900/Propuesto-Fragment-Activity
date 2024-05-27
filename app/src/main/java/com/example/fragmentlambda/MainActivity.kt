
package com.example.fragmentlambda

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onUsuarioCreated(usuario: Usuario) {
        val intent = Intent(this, HomeActivity::class.java).apply {
            putExtra("usuario", usuario)
        }
        startActivity(intent)
    }
}
