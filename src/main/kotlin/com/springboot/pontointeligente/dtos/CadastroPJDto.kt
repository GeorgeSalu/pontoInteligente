package com.springboot.pontointeligente.dtos

import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.NotEmpty
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF

data class CadastroPJDto (

    @get:NotEmpty(message = "Nome nao pode ser vazio")
    @get:Length( min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres")
    val nome: String = "",

    @get:NotEmpty(message = "Email nao pode ser vazio")
    @get:Length( min = 3, max = 200, message = "Email deve conter entre 3 e 200 caracteres")
    @get:Email(message = "Email invalido")
    val email: String = "",

    @get:NotEmpty(message = "senha não pode ser vazia")
    val senha: String = "",

    @get:NotEmpty(message = "cpf não pode ser vazia")
    @get:CPF(message = "CPF invalido")
    val cpf: String = "",

    @get:NotEmpty(message = "cnpj não pode ser vazia")
    @get:CNPJ(message = "cnpj invalido")
    val cnpj: String = "",

    @get:NotEmpty(message = "razao social nao pode ser vazio")
    @get:Length( min = 3, max = 200, message = "razao social deve conter entre 3 e 200 caracteres")
    val razaoSocial: String = "",

    val id: String? = null
)