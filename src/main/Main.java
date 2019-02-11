package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.dat"))) {
            List<Person> people = (List<Person>) ois.readObject();
            for (Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void run1() {
        City mykolaiv = new City("54000", "Mykolaiv");
        Person ivan = new Person(1,"Ivan", 29, 0, mykolaiv);
        Person petr = new Person(2,"Petr", 30, 0, mykolaiv);
        Person alex = new Person(3,"Alex", 25, 0, mykolaiv);
        List<Person> people = new ArrayList<>(List.of(ivan, petr, alex));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.dat"))) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
