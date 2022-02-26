package com.example.crud260222.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
    TODO 1 Dodanie supermocy - encja JPA - zmapuj obiekt do tabeli w RDBMS
 */
@Entity
// Lombok - don't do it at work! (z encjami)
@Data
public class Hobbit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
}
