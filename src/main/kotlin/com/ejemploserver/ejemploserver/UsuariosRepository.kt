package com.ejemploserver.ejemploserver

import org.springframework.data.jpa.repository.JpaRepository

interface UsuariosRepository : JpaRepository<Usuarios, String>
