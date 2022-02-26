package com.example.crud260222.controller;

import com.example.crud260222.model.Hobbit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


@SpringBootTest
@AutoConfigureMockMvc
class HobbitControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;


    @DisplayName("HTTP GET /hobbits -> HTTP 200")
    @Test
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

    @DisplayName("HTTP GET /hobbits -> HTTP 200 & Penlpe, Bilbo, X")
    @Test
    @SneakyThrows
    void given3HobbitsInDB_whenGETHobbits_shouldReturn3Hobbits() {

        var endpointToTest = "/hobbits";
        ResultActions resultActions = mockMvc
                .perform(
                        MockMvcRequestBuilders.get(endpointToTest)
                )
                .andDo(print())
                .andExpect(MockMvcResultMatchers.status().isOk());

        String hobbitsFromDBINJSONFromat = resultActions.andReturn().getResponse().getContentAsString();

        List<Hobbit> hobbitsFromDB = objectMapper.readValue(hobbitsFromDBINJSONFromat, new TypeReference<>() {
        });

        assertAll("lista 3 hobbitów, Penelope, Bilbo, X",
                () -> assertEquals(3, hobbitsFromDB.size()),
                () -> assertEquals("Penelope", hobbitsFromDB.get(0).getFirstName()),
                () -> assertEquals("Bilbo", hobbitsFromDB.get(1).getFirstName()),
                () -> assertEquals("X", hobbitsFromDB.get(2).getFirstName())
        );
    }


}