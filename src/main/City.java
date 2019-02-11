package main;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {
    private static final long serialVersionUID = 321L;

    private String postalCode;
    private String name;

    public City(String postalCode, String name) {
        this.postalCode = postalCode;
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(postalCode, city.postalCode) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode, name);
    }

    @Override
    public String toString() {
        return "City{" +
                "postalCode='" + postalCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
