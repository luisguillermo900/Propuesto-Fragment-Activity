
package com.example.fragmentlambda

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FormularioFragment : Fragment() {

    private var onUsuarioCreated: ((Usuario) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_formulario, container, false)

        val etNombre = view.findViewById<EditText>(R.id.et_nombre)
        val etApellidos = view.findViewById<EditText>(R.id.et_apellidos)
        val etCorreo = view.findViewById<EditText>(R.id.et_correo)
        val etCelular = view.findViewById<EditText>(R.id.et_celular)
        val etUsuario = view.findViewById<EditText>(R.id.et_usuario)
        val etContrasena = view.findViewById<EditText>(R.id.et_contrasena)
        val btnAceptar = view.findViewById<Button>(R.id.btn_aceptar)

        btnAceptar.setOnClickListener {
            val usuario = Usuario(
                etNombre.text.toString(),
                etApellidos.text.toString(),
                etCorreo.text.toString(),
                etCelular.text.toString(),
                etUsuario.text.toString(),
                etContrasena.text.toString()
            )
            onUsuarioCreated?.invoke(usuario)
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is MainActivity) {
            onUsuarioCreated = context::onUsuarioCreated
        }
    }

    override fun onDetach() {
        super.onDetach()
        onUsuarioCreated = null
    }

    companion object {
        @JvmStatic
        fun newInstance() = FormularioFragment()
    }
}
