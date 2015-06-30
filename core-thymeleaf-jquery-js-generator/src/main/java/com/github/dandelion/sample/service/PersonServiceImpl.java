package com.github.dandelion.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.dandelion.sample.model.Person;
import com.github.dandelion.sample.repository.PersonRepository;

/**
 * Implementation of the {@link PersonService}.
 * 
 * @author Thibault Duchateau
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	public List<Person> findLimited(int maxResult) {
		return personRepository.findLimited(maxResult);
	}
}