package com.api.unipar.controller;

import com.api.unipar.entidades.Cliente;
import com.api.unipar.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//CLASSE RESPONSAVEL POR EXPOR ENDPOINTS DA APLICAÇÃO REFERENTE A CLIENTES

//MARCA A CLASSE COMO UMA CLASSE REST OU SEJA EXPOE OS ENDPOINTS PARA O USO DE CLIENTES
@RestController

//DEFINE A ROTA PARA ACESSO AOS ENDPOINTS AQUI DESENVOLVIDOS
@RequestMapping("/api/v1/clientes")
public class ClientesController {

    //DEFINICAO DA CLASSE CLIENTE SERVICE PARA INJECAO DE DEPENDENCIAS
    private final ClienteService clienteService;

    //INJETO DE FATO AS DEPENDECIAS DEFINIDAS COMO FINAL ANTERIORMENTE
    public ClientesController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //EXPOE O ENDPOINT RESPONSAVEL POR RETORNAR A LISTA DE CLIENTES CADASTRADOS NO BANCO DE DADOS
    @GetMapping("/listar")
    public List<Cliente> listarTodosClientes() {
        return clienteService.listarTodosCLientes();
    }
}
