package com.example.crud260222.controller;

import com.example.crud260222.service.HobbitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HobbitController {

    private final HobbitService hobbitService;

}

/*
    TODO @Autowired to 'klej' aplikacji

    - wstrzykujemy przez konstruktor
    - od wersji Spring 4.3, tylko jeden konstruktor - nie musimy używać @Autowired
    - używając lomboka, nie musimy nawet dodawać konstruktora
    - dlaczego wstrzykujemy przez konstruktor? (dobra praktyka, ale dlaczego? :) )

 */