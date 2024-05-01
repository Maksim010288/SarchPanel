package com.tmCraftgruz.SearchPanel.controller;

import com.tmCraftgruz.SearchPanel.entity.OrderCellEntity;
import com.tmCraftgruz.SearchPanel.service.OrderCellService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderCellController {

    @Autowired
    private OrderCellService orderCellService;

    @GetMapping("/")
    public String order() {
        return "order_call";
    }

    @GetMapping("/delete")
    public String delete() {
        orderCellService.delete();
        return "order_call";
    }

    @GetMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("orderList", orderCellService.getAll());
        return "order_call";
    }

    @GetMapping("/re/findAll")
    public ResponseEntity<List<OrderCellEntity>> findAll() {
        return ResponseEntity.ok().body(orderCellService.getAll());
    }
}
