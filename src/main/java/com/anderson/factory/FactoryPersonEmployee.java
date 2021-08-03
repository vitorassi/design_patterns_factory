package com.anderson.factory;

import com.anderson.model.*;

public class FactoryPersonEmployee extends AbstractFactoryPerson {

    @Override
    PersonEmployee create() {
        return PersonEmployee.builder().personType(PersonType.EMPLOYEE).build();
    }
}
