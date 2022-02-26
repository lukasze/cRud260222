package com.example.crud260222.controller;

import com.example.crud260222.model.Hobbit;
import com.example.crud260222.service.HobbitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class HobbitController {

    private final HobbitService hobbitService;

    @GetMapping("/hobbits")
    List<Hobbit> findAll() {
        return hobbitService.findAll();
    }

}