package com.ejemploserver.ejemploserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuariosController( private val usuariosRepository: UsuariosRepository) {


    @GetMapping("/GetCrearusuarios/{usuarios}")
    fun getCrearusuarios(@PathVariable usuarios: String) : Usuarios {
        println("Se ha creado el usuario")
        val usuario = Usuarios("" + usuarios)
        println("El usuario se ha creado correctamente")
        usuariosRepository.save(usuario)
        println(usuario)
        return usuario
    }

}