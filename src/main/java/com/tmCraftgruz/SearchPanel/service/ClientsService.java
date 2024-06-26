package com.tmCraftgruz.SearchPanel.service;


import com.tmCraftgruz.SearchPanel.entity.ClientsEntity;
import com.tmCraftgruz.SearchPanel.model.MessageSenderModel;
import com.tmCraftgruz.SearchPanel.repository.ClientRepository;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientsService {

    private Logger LOGGER = Logger.getLogger(ClientsService.class);

    @Autowired
    private ClientRepository clientsRepository;

    public void add(MessageSenderModel messageSenderModel) {
        ClientsEntity clientsEntity = new ClientsEntity(
                messageSenderModel.getFirstName().toLowerCase(),
                messageSenderModel.getNumberPhone().toLowerCase(),
                messageSenderModel.getEmail().toLowerCase(),
                messageSenderModel.getPointOfDeparture().toLowerCase(),
                messageSenderModel.getItemOfImportance().toLowerCase(),
                messageSenderModel.getWeight());
        clientsRepository.save(clientsEntity);
        LOGGER.log(Level.INFO, "ADD NEW CLIENT : " + clientsEntity);
    }

    public List<ClientsEntity> getAll() {
        return new ArrayList<>(clientsRepository.findAll());
    }

    public List<ClientsEntity> findBy(String value) {
        return clientsRepository.findAll().stream()
                .filter(entity -> entity.getName().contains(value) ||
                        entity.getDeparture().equals(value.toLowerCase()) ||
                        entity.getImportance().equals(value.toLowerCase()) ||
                        entity.getWeight().equals(value) ||
                        entity.getTime().contains(value) ||
                        entity.getDate().contains(value))
                .collect(Collectors.toList());
    }

    public List<ClientsEntity> findByName(String value){
        return clientsRepository.findByDeparture(value);
    }
}
