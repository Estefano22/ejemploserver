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

                Preguntas("¿En qué año el hombre pisó la Luna por primera vez?","a.1963","b.1969", "c.1967"),
                Preguntas("¿Quién fue el primer presidente de la democracia española tras el franquismo?","a.Adolfo Suárez","b.Juan Enrique", "c.Pablo de Jesus"),
                Preguntas("¿Cuál es el idioma más hablado en Suiza?","a.Español","b.Ingles", "c.Aleman"),
                Preguntas("¿En qué mes el sol está más cerca de la Tierra?","a.Enero","b.Diciembre","c.Marzo"),
                Preguntas("¿Qué fabricó Alessandro Volta, por primera vez, en 1800?","a.Pila","b.Cargador","c.Pantalla"),
                Preguntas("¿Qué pieza de ajedrez puede hacer un movimiento en forma de L?","a.Reina","b.Peon","c.Caballo"),
                Preguntas("¿Quién fueron los finalistas de baloncesto en los Juegos Olímpicos de Los Ángeles de 1984?","a.España y Estados Unidos","b.Francia y Alemania","c.Italia y Hungria"),
                Preguntas("¿Qué deporte practican los Harlem Globetrotters?","a.Baloncesto","b.Furbol Americano","c.Futbol"),
                Preguntas("¿De qué colores es la bandera de México?","a.Azul,blanco y rojo","b.verde blanco y rojo","c.verde,blanco y Amarillo"),
                Preguntas("¿Qué cantidad de huesos en el cuerpo humano?","a.500","b.300","c.1200")
            )

            listadePreguntas.forEach {

                PreguntasRepository.save(it)
            }



            PreguntasRepository.findAll().forEach{

                println(it.toString().replace("[", "").replace("]","").replace(",","")
                )
            }
            println("Base de datos creada y llena de datos")

        }

    }
}


//https://azsalud.com/cultura-y-reflexion/preguntas-trivial