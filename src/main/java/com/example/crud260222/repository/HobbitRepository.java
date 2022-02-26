package com.example.crud260222.repository;

import com.example.crud260222.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/*
    Supermoce - 'ciastko z wisienką'
 */
public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
