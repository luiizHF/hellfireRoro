package com.luiizhf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.luiizhf.model.Person;
import com.luiizhf.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{
	
	private static final Log LOG = LogFactory.getLog(ExampleServiceImpl.class);

	@Override
	public List<Person> getListPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Luiiz", 26));
		people.add(new Person("Luiizhf", 26));
		people.add(new Person("LuiizLM", 26));
		people.add(new Person("LuiizMO", 26));
		LOG.info("HELLO FROM SERVICE");
		return people;
	}
	
}
