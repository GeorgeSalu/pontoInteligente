package com.springboot.pontointeligente.controllers

import com.springboot.pontointeligente.documents.Empresa
import com.springboot.pontointeligente.dtos.EmpresaDto
import com.springboot.pontointeligente.response.Response
import com.springboot.pontointeligente.services.EmpresaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/empresas")
class EmpresaController(val empresaService: EmpresaService) {

    @GetMapping(value = "/cnpj/{cnpj}")
    fun buscarPorCnpj(@PathVariable("cnpj") cnpj: String): ResponseEntity<Response<EmpresaDto>> {
        val response: Response<EmpresaDto> = Response<EmpresaDto>()
        val empresa: Empresa? = empresaService.buscarPorCpnj(cnpj)

        if (empresa == null) {
            response.erros.add("Empresa não econtrada para o CNPJ ${cnpj}")
            return ResponseEntity.badRequest().body(response)
        }

        response.data = converterEmpresaDto(empresa)
        return ResponseEntity.ok(response)
    }

    private fun converterEmpresaDto(empresa: Empresa): EmpresaDto =
            EmpresaDto(empresa.razaoSocial, empresa.cnpj, empresa.id)

}