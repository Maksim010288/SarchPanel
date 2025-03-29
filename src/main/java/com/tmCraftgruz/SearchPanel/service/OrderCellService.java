package com.tmCraftgruz.SearchPanel.service;

import com.tmCraftgruz.SearchPanel.entity.OrderCellEntity;
import com.tmCraftgruz.SearchPanel.repository.OrderCellRepository;
import com.tmCraftgruz.SearchPanel.soung.MusicPlayer;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Data
public class OrderCellService {

    @Autowired
    private OrderCellRepository orderCellRepository;

    @Autowired
    private MusicPlayer musicPlayer;


    public void delete() {
        for (OrderCellEntity entity : orderCellRepository.findAll()) {
            orderCellRepository.deleteById(entity.getId().longValue());
        }
    }

    public List<OrderCellEntity> getAll() {
        return orderCellRepository.findAll()
                .stream()
                .filter(orderCellEntity -> orderCellEntity.getId() != null)
                .collect(Collectors.toList());
    }
}
