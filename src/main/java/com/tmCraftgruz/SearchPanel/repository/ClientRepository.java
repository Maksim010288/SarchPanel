package com.tmCraftgruz.SearchPanel.repository;

import com.tmCraftgruz.SearchPanel.entity.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientsEntity, Long> {

    @Query(value = "select * from craftload_clients where name = ?", nativeQuery = true)
    List<ClientsEntity> findByName(String value);

    @Query(value = "select * from craftload_clients where departure = ?", nativeQuery = true)
    List<ClientsEntity> findByDeparture(String value);

    @Query(value = "select * from craftload_clients where date = ?", nativeQuery = true)
    List<ClientsEntity> findByDate(String value);

    @Query(value = "select * from craftload_clients where importance = ?", nativeQuery = true)
    List<ClientsEntity> findByImportance(String value);

    @Query(value = "select * from craftload_clients where time <= ?", nativeQuery = true)
    List<ClientsEntity> findByTime(String value);


}
