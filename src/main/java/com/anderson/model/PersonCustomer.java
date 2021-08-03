package com.anderson.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class PersonCustomer extends Person{

    @Setter
    private Group group;

    @Builder
    public PersonCustomer(Long id, String name, Status status,
                          List<Address> address, PersonType personType,
                          Group Group) {
        super(id, name, status, address, personType);
        this.group = Group;
    }
}
