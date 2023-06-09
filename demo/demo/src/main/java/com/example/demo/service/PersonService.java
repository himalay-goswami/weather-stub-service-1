package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fake DAO") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void addPerson(Person person){
        personDAO.insertPerson(person);

    }
}
