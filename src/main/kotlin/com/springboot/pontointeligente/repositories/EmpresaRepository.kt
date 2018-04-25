package com.springboot.pontointeligente.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import com.springboot.pontointeligente.documents.Empresa

interface EmpresaRepository : MongoRepository<Empresa, String> {

	fun findByCnpj()
}