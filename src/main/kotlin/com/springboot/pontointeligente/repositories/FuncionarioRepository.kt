package com.springboot.pontointeligente.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import com.springboot.pontointeligente.documents.Funcionario

interface FuncionarioRepository : MongoRepository<Funcionario, String>{

	fun findByEmail(email: String): Funcionario
	
	fun findByCpf(cpf: String): Funcionario
}