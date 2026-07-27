package com.quelen.orderflow.controller;

import com.quelen.orderflow.model.Pedido;
import com.quelen.orderflow.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedido> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Pedido criar(@RequestBody Pedido pedido) {
        return service.salvar(pedido);
    }
}