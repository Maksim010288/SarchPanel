package com.tmCraftgruz.SearchPanel.service;

import com.tmCraftgruz.SearchPanel.entity.UsersAppEntity;
import com.tmCraftgruz.SearchPanel.repository.UsersAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersAppService {

    @Autowired
    private UsersAppRepository usersAppRepository;

    public void add(UsersAppEntity userEntity){
        usersAppRepository.save(userEntity);
    }

    public void delete(){
        usersAppRepository.deleteAll();
    }
}
