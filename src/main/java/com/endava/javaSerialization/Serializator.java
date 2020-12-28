package com.endava.javaSerialization;

import java.io.*;

public class Serializator {
    public boolean serialize(Person person) {
        boolean flag = false;
        File file = new File("src/main/java/com/endava/javaserialization/resources/serialization.txt");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return flag;
        }
    }


    public Person deserialize() throws InvalidObjectException {
        File file = new File("src/main/java/com/endava/javaserialization/resources/serialization.txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert ois != null;
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("failure");
    }
}
