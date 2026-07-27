package com.quelen.orderflow.service;

import com.quelen.orderflow.model.Pedido;
import com.quelen.orderflow.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }
}