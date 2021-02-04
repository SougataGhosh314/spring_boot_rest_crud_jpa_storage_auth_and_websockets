package com.sougata.crud_webservice.controllers.database;

import com.sougata.crud_webservice.dao.PeopleDao;
import com.sougata.crud_webservice.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class DatabaseController {

    @Autowired
    private PeopleDao dao;

    @PostMapping(value="/create_person")
    @ResponseBody
    public Person createPerson(@RequestBody Person person) {
        dao.save(person);
        return person;
    }

    @PutMapping(value="/update_person")
    @ResponseBody
    public Person updatePerson(@RequestBody Person person) {
        dao.save(person);
        return person;
    }

    @PutMapping(value="/update_name")
    @ResponseBody
    public Person updateName(@RequestParam String userID,
                                       @RequestParam String name) {
        Person temp = dao.findById(userID).orElse(null);
        //dao.findById(userID).orElse(null).setName(name);
        temp.setName(name);
        dao.save(temp);
        return temp;
        //return person;
    }

    @GetMapping(value="/get_people")
    @ResponseBody
    public List<Person> getPeople() {
        return (List<Person>) dao.findAll();
    }

    @DeleteMapping(value="/remove_person")
    @ResponseBody
    public Person removePerson(@RequestParam String userID) {
        Person temp = dao.findById(userID).orElse(null);
        dao.delete(temp);
        return temp;
    }
}
