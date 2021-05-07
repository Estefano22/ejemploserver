package com.ejemploserver.ejemploserver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.swing.text.StyledEditorKit

// Entity nos dice que Tarea es una clase y también será una tabla de nuestra BBDD.
@Entity
class Tarea(
    var titulo : String,
    var detalles : String = "",
    var esFavorita : Boolean,
    var fechaCreacion : Long = System.currentTimeMillis(),
    var fechaEdicion : Long = fechaCreacion) {

    @Id
    @GeneratedValue
    private var id = 0L


    override fun toString(): String {
        return "La tarea con id = $id contiene a $titulo"
    }

}