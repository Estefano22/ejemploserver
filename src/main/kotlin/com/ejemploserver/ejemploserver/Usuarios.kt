package com.ejemploserver.ejemploserver

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Usuarios (@Id var nombre: String ){

    override fun toString(): String {
        return " El usuario creado es $nombre "
    }

}
