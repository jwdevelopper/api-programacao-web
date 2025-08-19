package com.api.unipar.service;

import com.api.unipar.entidades.Cliente;
import com.api.unipar.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;


//CLASSE RESPONSAVEL POR CONTER NOSSA REGRA DE NEGOCIO, A LOGICA DA APLICAÇÃO
@Service
public class ClienteService {

    //INJETANDO AS DEPENENCIAS DO MEU SERVICE, NO CASO O REPOSITORIO
    private final ClienteRepository clienteRepository;

    //METODO CONSTRUTOR, RESPONSAVEL POR INJETAR DE FATO O REPOSITORIO E DEMAIS DEPENDENCIAS
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //METODO RESPONSAVEL POR LISTAR OS CLIENTES CADASTRADOS NO BANCO DE DADOS
    public List<Cliente> listarTodosCLientes() {
        return clienteRepository.findAll();
    }
}
