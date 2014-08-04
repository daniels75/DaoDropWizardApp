package org.daniels.examples.dropwizard.dao;

import io.dropwizard.hibernate.AbstractDAO;

import java.util.List;

import org.daniels.examples.dropwizard.core.Person;
import org.hibernate.SessionFactory;

import com.google.common.base.Optional;

public class PersonDAO extends AbstractDAO<Person> {
    public PersonDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<Person> findById(Long id) {
        return Optional.fromNullable(get(id));
    }

    public Person create(Person person) {
        return persist(person);
    }

    public List<Person> findAll() {
        return list(namedQuery("com.example.helloworld.core.Person.findAll"));
    }
}
