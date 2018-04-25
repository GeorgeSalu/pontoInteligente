package com.springboot.pontointeligente.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import com.springboot.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Page

interface LancamentoRepository : MongoRepository<Lancamento, String> {

	fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<Lancamento>
}