package com.example.javaproject2.week7.day30_31;

import com.example.javaproject2.week7.day30_31.model.BaseDAO;
import com.example.javaproject2.week7.day30_31.model.Person;
import com.example.javaproject2.week7.day30_31.model.PersonDAO;
import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList);
        System.out.println(personDAO.findByNamePerson("bab"));
    }
}
