package com.tmCraftgruz.SearchPanel.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_cell")
@Data
public class OrderCellEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "name")
    public String name;
    @Column(name = "number_phone")
    public String numberPhone;

    public OrderCellEntity(){}

    public OrderCellEntity(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }
}
