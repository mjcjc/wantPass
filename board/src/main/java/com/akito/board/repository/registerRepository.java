package com.akito.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akito.board.Entity.UserEntity;

@Repository
//pk문제제
public interface registerRepository extends JpaRepository<UserEntity, Long> {

    
}