package com.example.crud260222.repository;

import com.example.crud260222.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Supermoce - 'ciastko z wisienką'
 */
public interface HobbitRepository extends JpaRepository<Hobbit, Long> {
}
