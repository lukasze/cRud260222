package com.example.crud260222.service;

import com.example.crud260222.model.Hobbit;
import com.example.crud260222.repository.HobbitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HobbitService {
    private final HobbitRepository hobbitRepository;

    public List<Hobbit> findAll() {
        return List.of(
                    new Hobbit(1L, "Frodo", "Baggins"),
                    new Hobbit(2L, "Bilbo", "Baggins"),
                    new Hobbit(3L, "Penelope", "Tuk")
                );
    }

}
