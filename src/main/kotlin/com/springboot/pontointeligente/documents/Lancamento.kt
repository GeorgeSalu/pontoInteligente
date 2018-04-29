package com.springboot.pontointeligente.documents

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import com.springboot.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id

@Document
data class Lancamento (
	val data: Date,
	val tipo: TipoEnum,
	val funcionarioId: String,
	val descricao: String? = "",
	val localizacao: String? = "",
	@Id val id: String? = null 
)