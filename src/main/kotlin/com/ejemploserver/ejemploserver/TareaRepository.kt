package com.ejemploserver.ejemploserver

import org.springframework.data.jpa.repository.JpaRepository

interface TareaRepository : JpaRepository<Tarea, Long>