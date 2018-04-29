package com.springboot.pontointeligente.controllers

import com.springboot.pontointeligente.services.FuncionarioService
import com.springboot.pontointeligente.services.LancamentoService
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/lancamentos")
class LancamentoController(val lancamentoService: LancamentoService,
                           val funcionarioService: FuncionarioService) {

    @Value("\${paginacao.qtd_por_pagina}")
    val qtdPorPaginas: Int = 15

}