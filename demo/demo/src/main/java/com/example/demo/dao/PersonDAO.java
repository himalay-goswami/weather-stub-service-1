package com.example.demo.dao;

import com.example.demo.model.Person;

import javax.swing.*;
import java.util.UUID;

public interface PersonDAO {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();

        return insertPerson(id, person);
    }
}
