
package com.example.fragmentlambda

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val usuario = intent.getParcelableExtra<Usuario>("usuario")
        usuario?.let {
            findViewById<TextView>(R.id.tv_nombre).text = it.nombre
            findViewById<TextView>(R.id.tv_apellidos).text = it.apellidos
            findViewById<TextView>(R.id.tv_correo).text = it.correo
            findViewById<TextView>(R.id.tv_celular).text = it.celular
            findViewById<TextView>(R.id.tv_usuario).text = it.usuario
            findViewById<TextView>(R.id.tv_contrasena).text = it.contrasena
        }
    }
}
