
package com.example.fragmentlambda

import android.os.Parcel
import android.os.Parcelable

data class Usuario(
    val nombre: String?,
    val apellidos: String?,
    val correo: String?,
    val celular: String?,
    val usuario: String?,
    val contrasena: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellidos)
        parcel.writeString(correo)
        parcel.writeString(celular)
        parcel.writeString(usuario)
        parcel.writeString(contrasena)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Usuario> {
        override fun createFromParcel(parcel: Parcel): Usuario {
            return Usuario(parcel)
        }

        override fun newArray(size: Int): Array<Usuario?> {
            return arrayOfNulls(size)
        }
    }
}
