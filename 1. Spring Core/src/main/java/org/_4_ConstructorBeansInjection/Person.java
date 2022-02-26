package org._4_ConstructorBeansInjection;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    Certificate certificate;
    List<String> list;

    public Person(String name, int personId, Certificate certificate, List<String> list) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.list = list;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                ", list=" + list +
                '}';
    }
}
