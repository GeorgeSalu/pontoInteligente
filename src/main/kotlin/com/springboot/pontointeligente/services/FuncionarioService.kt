package com.springboot.pontointeligente.services

import com.springboot.pontointeligente.documents.Funcionario

interface FuncionarioService {

    fun persitir(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun buscarPorEmail(email: String): Funcionario?

    fun buscarPorId(email: String): Funcionario?

}