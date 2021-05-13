package com.ejemploserver.ejemploserver

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class EjercicioquienquieresermillonarioApplication




fun main(args: Array<String>) {
	println("Comenzamos el servidor")
	runApplication<EjercicioquienquieresermillonarioApplication>(*args)
	println("Creación del servidor completada")

}
