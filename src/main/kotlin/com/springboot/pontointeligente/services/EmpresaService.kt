package com.springboot.pontointeligente.services

import com.springboot.pontointeligente.documents.Empresa

interface EmpresaService {

    fun buscarPorCpnj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa
}