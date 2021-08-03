package com.anderson.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonEmployee extends Person{

    private String rnCompany;

    @Builder
    PersonEmployee(Long id, String name, Status status, List<Address> address,
                   PersonType personType, String rnCompany) {
        super(id, name, status, address, personType);
        this.rnCompany = rnCompany;
    }
}
