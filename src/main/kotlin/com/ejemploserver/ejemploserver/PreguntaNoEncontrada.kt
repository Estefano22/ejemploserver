package com.ejemploserver.ejemploserver

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

class PreguntaNoEncontradaException(id: Long) : RuntimeException("La tarea con id = $id no existe.")

@ControllerAdvice
class PreguntaNoEncontrada {

    @ResponseBody
    @ExceptionHandler(PreguntaNoEncontradaException::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun excepcionPorPreguntaNoEncontrada(exception: PreguntaNoEncontradaException) : String? {
        return exception.message
    }
}