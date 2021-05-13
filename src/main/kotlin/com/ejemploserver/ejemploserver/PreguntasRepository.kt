package com.ejemploserver.ejemploserver

import org.springframework.data.jpa.repository.JpaRepository

interface PreguntasRepository : JpaRepository<Preguntas, Long>