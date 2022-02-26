package com.example.crud260222.controller;

import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/*
    Supermoc: 'postaw' cały kontekst Spring'a przed uruchomieniem @Test
 */
@SpringBootTest
// Podpowiadamy Spring'owi, jak utworzyć ziarno z klasy MockMvc
@AutoConfigureMockMvc
class HobbitControllerTest {

    // API do testów endpoitnow
    // to ok, żeby w testach wstrzykiwać przez pole
    @Autowired
    private MockMvc mockMvc;

    // Junit 5
    @DisplayName("HTTP GET /hobbits -> HTTP 200")
    // Junit
    @Test
    // Lombok
    @SneakyThrows
    void hobbitsGET() {

        var endpointToTest = "/hobbits";
        mockMvc
                .perform(
                        MockMvcRequestBuilders.get(endpointToTest)
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


}