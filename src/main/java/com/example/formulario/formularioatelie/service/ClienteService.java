package com.example.formulario.formularioatelie.service;

import com.example.formulario.formularioatelie.model.entity.Cliente;
import com.example.formulario.formularioatelie.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void salvarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }
}
