package com.ejemploserver.ejemploserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UsuariosController( private val usuariosRepository: UsuariosRepository) {


    @GetMapping("/GetCrearusuarios/{usuarios}")
    fun getCrearusuarios(@PathVariable usuarios: String) : Usuarios {
        println("Se ha creado el usuarios")
        val usuario = Usuarios("" + usuarios)
        usuariosRepository.save(usuario)
        println(usuario)
        return usuario
    }

}