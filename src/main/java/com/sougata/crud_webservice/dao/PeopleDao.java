package com.sougata.crud_webservice.dao;

import com.sougata.crud_webservice.models.Person;
import org.springframework.data.repository.CrudRepository;

// CrudRepository => for integrating with Spring data jpa
// Person ---> Our class, String --> type of primary key
public interface PeopleDao extends CrudRepository<Person, String> {

}


