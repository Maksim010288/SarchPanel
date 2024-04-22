package com.tmCraftgruz.SearchPanel.entity;

import com.tmCraftgruz.SearchPanel.ClientsMessageData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Entity
@Table(name = "craft_gruz_clients")
@Getter
@AllArgsConstructor
@ToString
public class ClientsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "departure")
    private String departure;
    @Column(name = "importance")
    private String importance;
    @Column(name = "weight")
    private String weight;
    @Column(name = "date")
    private String date;
    @Column(name = "time")
    private String time;

    public ClientsEntity(){}

    public ClientsEntity(String name, String phone, String email,
                         String departure, String importance, String weight){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.departure = departure;
        this.importance = importance;
        this.weight = weight;
        this.date = ClientsMessageData.getDate();
        this.time = ClientsMessageData.getTime();
    }
}
