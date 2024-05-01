package com.tmCraftgruz.SearchPanel.service;

import com.tmCraftgruz.SearchPanel.entity.OrderCellEntity;
import com.tmCraftgruz.SearchPanel.repository.OrderCellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderCellService {

    @Autowired
    private OrderCellRepository orderCellRepository;


    public void delete(){
        for (OrderCellEntity entity : orderCellRepository.findAll()){
            orderCellRepository.deleteById(entity.getId().longValue());
        }
    }

    public List<OrderCellEntity> getAll(){
      return orderCellRepository.findAll()
               .stream()
               .filter(orderCellEntity -> orderCellEntity.getId() != null)
               .collect(Collectors.toList());
    }
}
