package com.tmCraftgruz.SearchPanel.repository;

import com.tmCraftgruz.SearchPanel.entity.UsersAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersAppRepository extends JpaRepository<UsersAppEntity, Long> {
    @Query(value = "select * from clients where login=?", nativeQuery = true)
    UsersAppEntity findByUserName(String username);
}
