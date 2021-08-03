package com.anderson.factory;

import com.anderson.model.Group;
import com.anderson.model.Person;
import com.anderson.model.PersonCustomer;
import com.anderson.model.PersonType;

public class FactoryPersonCustomer extends AbstractFactoryPerson {

    @Override
    Person create() {
        return PersonCustomer.builder().personType(PersonType.CUSTOMER).Group(Group.PROSPECT).build();
    }
}
