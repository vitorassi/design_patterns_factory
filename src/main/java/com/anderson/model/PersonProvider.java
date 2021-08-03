package com.anderson.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Locale;

@Getter
@Setter
public class PersonProvider extends Person{

    private Category category;

    @Builder
    PersonProvider(Long id, String name, Status status, List<Address> address,
                   PersonType personType, Category category) {
        super(id, name, status, address, personType);
        this.category = category;
    }

    @Override
    public String toString() {

        return super.toString() +
                "{" +
                    "category=" + category +
                '}';
    }
}
