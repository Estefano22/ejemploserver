package com.ejemploserver.ejemploserver

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Database {

    @Bean
    fun initDatabase(tareaRepository: TareaRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            println("Base de datos creándose")
            val listaTareas = listOf(
                Tarea("Hacer la cama", esFavorita = false),
                Tarea("Desayunar", esFavorita = true),
                Tarea("Ir al centro", esFavorita = false),
                Tarea("Dar clase", esFavorita = false),
                Tarea("Volver a casa", esFavorita = true)
            )

            listaTareas.forEach {
                tareaRepository.save(it)
            }

            tareaRepository.findAll().forEach{
                println(it)
            }
            println("Base de datos creada y llena de datos")

        }
    }
}