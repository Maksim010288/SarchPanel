package com.tmCraftgruz.SearchPanel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Entity()
@Table(name = "clients")
@Data
@Component
public class UsersAppEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    private String role;

    public UsersAppEntity(){}

    public UsersAppEntity(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
}
