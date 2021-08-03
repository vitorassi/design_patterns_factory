package com.anderson.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;




@Getter
@AllArgsConstructor
public abstract class Person {

    @Setter
    private Long id;

    @Setter
    private String name;

    @Setter
    private Status status;

    @Setter
    private List<Address> address;

    private PersonType personType;

    @Override
    public String toString() {
        return "\n" +"Person{" +
                "personType=" + personType.name() +
                '}';
    }
}
