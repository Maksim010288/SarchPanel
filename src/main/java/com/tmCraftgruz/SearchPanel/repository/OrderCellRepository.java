package com.tmCraftgruz.SearchPanel.repository;

import com.tmCraftgruz.SearchPanel.entity.OrderCellEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCellRepository extends JpaRepository<OrderCellEntity, Long> {
}
