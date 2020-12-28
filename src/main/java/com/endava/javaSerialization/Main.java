package com.endava.javaSerialization;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {

        Person personSer = new Person();
        personSer.setName("Leonardo DiCaprio");

        Serializator serializator = new Serializator();

        System.out.println(serializator.serialize(personSer));

        try {
            Person person = serializator.deserialize();
            System.out.println(person.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

    }
}
