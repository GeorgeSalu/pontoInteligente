package com.springboot.pontointeligente

import com.springboot.pontointeligente.documents.Empresa
import com.springboot.pontointeligente.documents.Funcionario
import com.springboot.pontointeligente.enums.PerfilEnum
import com.springboot.pontointeligente.repositories.EmpresaRepository
import com.springboot.pontointeligente.repositories.FuncionarioRepository
import com.springboot.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
                                  val funcionarioRepository: FuncionarioRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        empresaRepository.deleteAll()
        funcionarioRepository.deleteAll()

        val empresa: Empresa = Empresa("empresa", "232443554")
        empresaRepository.save(empresa)

        val admin: Funcionario = Funcionario("admin", "email@gmail.com.br",
                SenhaUtils().gerarBcrypt("2233322"), "223454342",
                PerfilEnum.ROLE_ADMIN, empresa.id!!)

        val funcionario: Funcionario = Funcionario("funcionario",
                "email@gmail.com.br", SenhaUtils().gerarBcrypt("223332"),
                "3442323", PerfilEnum.ROLE_USUARIO, empresa.id!!)

        funcionarioRepository.save(funcionario)

        System.out.println("Empresa Id"+empresa.id)
        System.out.println("Admin Id"+admin.id)
        System.out.println("funcionario Id"+funcionario.id)
    }


}

fun main(args: Array<String>) {
    SpringApplication.run(PontointeligenteApplication::class.java, *args)
}
