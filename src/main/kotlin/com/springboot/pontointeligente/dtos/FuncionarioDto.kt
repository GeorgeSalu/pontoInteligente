package com.springboot.pontointeligente.dtos

import org.hibernate.validator.constraints.Email
import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.NotEmpty
import kotlin.math.min

data class FuncionarioDto (

    @get:NotEmpty(message = "Nome não pode ser vazio")
    @get:Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres")
    val nome: String = "",

    @get:NotEmpty(message = "Email nao pode ser vazio")
    @get:Length(min = 5, max = 200 , message = "Email deve conter entre 5 e 200 caracteres")
    @get:Email(message = "email invalido")
    val email: String = "",

    val senha: String? = null,
    val valorHora:String? = null,
    val qtdHorasTrabalhoDia: String? = null,
    val qtdHorasAlmoco: String? = null,
    val id: String? = null
)