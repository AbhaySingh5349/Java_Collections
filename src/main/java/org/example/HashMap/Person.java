package org.example.HashMap;

import java.util.Objects;

public class Person {
    Integer id;
    String name;
    Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person other = (Person) obj;

        return Objects.equals(other.id, this.id) && Objects.equals(this.name, other.name) && Objects.equals(this.age, other.age);
    }

    // bucket key will be same for all person objects i.e part of same linked list
    @Override
    public int hashCode() {
        return 1;
    }
}
