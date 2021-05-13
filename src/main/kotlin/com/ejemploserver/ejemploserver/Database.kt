package com.ejemploserver.ejemploserver

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Database {

    @Bean
    fun initDatabase(PreguntasRepository: PreguntasRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<out String>? ->
            println("Base de datos creándose")
            println("PREGUNTAS:")
            val listadePreguntas = arrayListOf<Preguntas>(

                Preguntas("¿En qué año el hombre pisó la Luna por primera vez?","1963","1969", "1967"),
                Preguntas("¿Quién fue el primer presidente de la democracia española tras el franquismo?","Adolfo Suárez","Juan Enrique", "Pablo de Jesus"),
                Preguntas("¿Cuál es el idioma más hablado en Suiza?","Español","Ingles", "Aleman"),
                Preguntas("¿En qué mes el sol está más cerca de la Tierra?","Enero","Diciembre","Marzo"),
                Preguntas("¿Qué fabricó Alessandro Volta, por primera vez, en 1800?","Pila","Cargador","Pantalla"),
                Preguntas("¿Qué pieza de ajedrez puede hacer un movimiento en forma de L?","Reina","Peon","Caballo"),
                Preguntas("¿Quién fueron los finalistas de baloncesto en los Juegos Olímpicos de Los Ángeles de 1984?","España y Estados Unidos","Francia y Alemania","Italia y Hungria"),
                Preguntas("¿Qué deporte practican los Harlem Globetrotters?","Baloncesto","Furbol Americano","Futbol"),
                Preguntas("¿De qué colores es la bandera de México?","Azul,blanco y rojo","verde,blanco y rojo","verde,blanco y Amarillo"),
                Preguntas("¿Qué cantidad de huesos en el cuerpo humano?","500","300","1200")
                )

            listadePreguntas.forEach {
                PreguntasRepository.save(it)
            }

            PreguntasRepository.findAll().forEach{
                    println(it)
            }
                        println("Base de datos creada y llena de datos")

        }
    }
}


//https://azsalud.com/cultura-y-reflexion/preguntas-trivial