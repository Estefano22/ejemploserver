package com.ejemploserver.ejemploserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

class PreguntasController {

    @RestController
    class TareaController(private val preguntasRepository: PreguntasRepository,  private val UsuariosRepository: UsuariosRepository) {

        @GetMapping("/GetPreguntas/{usuarios}")
        fun getPreguntas(@PathVariable usuarios: String) : List<Preguntas> {
            try {
                println("Se ha recibido un GetPreguntas")
                val list = preguntasRepository.findAll()
                val Usuarios = UsuariosRepository.getOne(usuarios)
                println(list)
                return list
            }catch (e:Exception){
                throw UsuarioNoEncontradoException(usuarios)
            }

        }


        @GetMapping("/getPreguntasById/{id}/{usuarios}")
        fun getPreguntasById(@PathVariable id : Long , @PathVariable usuarios: String) : Preguntas {
            try {
                println("Se ha recibido un GetPreguntasById")
                val Preguntas = preguntasRepository.getOne(id)
                val Usuarios = UsuariosRepository.getOne(usuarios)
                println(Preguntas)
                println(Usuarios)
                return Preguntas

            } catch (e: Exception) {
                throw PreguntaNoEncontradaException(id)
            }

            try {
                val Usuarios = UsuariosRepository.getOne(usuarios)
                println(Usuarios)
                return usuarios
            } catch (e: Exception) {
                throw UsuarioNoEncontradoException(usuarios)
            }

        }

        @GetMapping("/GetPreguntasAleatoria/{usuarios}")
        fun getPreguntasAleatoria(@PathVariable usuarios: String) : Preguntas {
            try {
                println("Se ha recibido un GetPreguntasAleatorias")
                val list = preguntasRepository.findAll()
                val Usuarios = UsuariosRepository.getOne(usuarios)
                val mutableList = list.toMutableList()
                mutableList.shuffle()
                println(mutableList.toString().replace("[", "").replace("]","").replace(",",""))
                println(mutableList[0]) //para mostrar solo un elemento de la lista
                return mutableList[0]

            } catch (e:Exception){
                throw UsuarioNoEncontradoException(usuarios)

            }

        }
    }
}