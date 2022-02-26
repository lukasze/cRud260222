package com.example.crud260222.service;

import com.example.crud260222.repository.HobbitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HobbitService {
    private final HobbitRepository hobbitRepository;

}
