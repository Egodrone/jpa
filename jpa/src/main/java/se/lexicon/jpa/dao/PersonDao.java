package se.lexicon.jpa.dao;


import se.lexicon.jpa.entity.Person;
import java.util.List;


public interface PersonDao {
    Person create(Person person);
    Person findById(int personId);
    List<Person> findAll();
    List<Person> findByFirstName(String firstName);
    void remove(int id);
    Person update(Person person);
    List<Person> savePerson(List<Person> persons);
}
