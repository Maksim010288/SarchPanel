package com.tmCraftgruz.SearchPanel.repository;

import com.tmCraftgruz.SearchPanel.entity.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientsEntity, Long> {

    @Query(value = "select * from craft_gruz_clients where departure = ?", nativeQuery = true)
    List<ClientsEntity> findByDeparture(String value);
}
