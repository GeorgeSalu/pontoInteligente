package com.springboot.pontointeligente.documents

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.annotation.Id

@Document
data class Empresa (
	val razaoSocial: String,
	val cnpj: String,
	@Id val id: String? = null 
)