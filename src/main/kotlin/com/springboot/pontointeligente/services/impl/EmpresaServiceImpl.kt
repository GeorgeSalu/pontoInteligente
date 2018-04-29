package com.springboot.pontointeligente.services.impl

import com.springboot.pontointeligente.documents.Empresa
import com.springboot.pontointeligente.repositories.EmpresaRepository
import com.springboot.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCpnj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}