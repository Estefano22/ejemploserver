package com.ejemploserver.ejemploserver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

// Entity nos dice que Tarea es una clase y también será una tabla de nuestra BBDD.
@Entity
data class Preguntas(
    var  preguntas : String,
    var op1 : String,
    var op2 : String,
    var op3 : String,
){



    @Id
    @GeneratedValue
    private var id = 0L


    override fun toString(): String {
        val listadeOpciones = mutableListOf(op1,op2,op3)
        // listadeOpciones.shuffle() // shuffle te lo pone aleatorio
        return "Pregunta $id : $preguntas,\n $listadeOpciones \n"


    }

}



