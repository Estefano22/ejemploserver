package com.ejemploserver.ejemploserver

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

class UsuarioNoEncontradoException(usuarios: String) : RuntimeException("El usuario $usuarios no es valido.")

@ControllerAdvice
class UsuarioNoEncontrado {

    @ResponseBody
    @ExceptionHandler(UsuarioNoEncontradoException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun excepcionPorUsuarioNoEncontrado(exception: UsuarioNoEncontradoException) : String? {
        return exception.message
    }
}