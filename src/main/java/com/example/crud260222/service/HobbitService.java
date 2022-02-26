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
        return hobbitRepository.findAll();
    }
}
