package main;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private final static long serialVersionUID = 123L;

    private int id;
    private String name;
    private int age;
    private double salary;
    private City homeCity;

    public Person(int id, String name, int age, double salary, City homeCity) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.homeCity = homeCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public City getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(City homeCity) {
        this.homeCity = homeCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(homeCity, person.homeCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary, homeCity);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", homeCity=" + homeCity +
                '}';
    }
}
