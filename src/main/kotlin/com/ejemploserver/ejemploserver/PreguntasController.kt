package com.ejemploserver.ejemploserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

class PreguntasController {

    @RestController
    class TareaController(private val preguntasRepository: PreguntasRepository) {

        @GetMapping("/GetPreguntas")
        fun getPreguntas() : List<Preguntas> {
            println("Se ha recibido un GetPreguntas")
            val list = preguntasRepository.findAll()
            println(list)
            return list
        }


        @GetMapping("/getPreguntasById/{id}")
        fun getPreguntasById(@PathVariable id : Long) : Preguntas {
            try {
                println("Se ha recibido un GetTareaById")
                val Preguntas = preguntasRepository.getOne(id)
                println(Preguntas)
                return Preguntas
            } catch (e:Exception) {
                throw PreguntaNoEncontradaException(id)
            }
        }

        @GetMapping("/GetPreguntasAleatoria")
        fun getPreguntasAleatoria() : List<Preguntas> {
            println("Se ha recibido un GetPreguntas")
            val list = preguntasRepository.findAll()
            val mutableList = list.toMutableList()
            mutableList.shuffle()
            println(mutableList)
            return (mutableList)
        }




    }
}