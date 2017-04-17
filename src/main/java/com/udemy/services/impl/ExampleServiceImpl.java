package com.udemy.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.udemy.model.Person;
import com.udemy.services.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG = LogFactory.getLog(ExampleService.class);

	@Override
	public List<Person> getListPeople() {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Carlos", 20));
		people.add(new Person("juan", 50));
		people.add(new Person("Carlos", 20));
		people.add(new Person("juan", 50));
		LOG.info("hello fron service");
		return people;

	}

}
