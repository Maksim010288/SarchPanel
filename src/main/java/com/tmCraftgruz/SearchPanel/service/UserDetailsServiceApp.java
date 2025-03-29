package com.tmCraftgruz.SearchPanel.service;

import com.tmCraftgruz.SearchPanel.entity.UsersAppEntity;
import com.tmCraftgruz.SearchPanel.repository.UsersAppRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserDetailsServiceApp implements UserDetailsService {

    private UsersAppEntity usersAppEntity;

    @Autowired
    private UsersAppRepository usersAppRepository;

    @Autowired
    public UserDetailsServiceApp(UsersAppRepository usersAppRepository) {
        this.usersAppRepository = usersAppRepository;
    }

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        this.usersAppEntity = usersAppRepository.findByUserName(username);
        if (usersAppEntity == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new UserDetailsApp(usersAppEntity);
    }
}
