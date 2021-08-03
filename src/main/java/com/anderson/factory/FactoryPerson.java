package com.anderson.factory;

import com.anderson.model.Person;

public class FactoryPerson {

    private AbstractFactoryPerson factoryPerson;

    public FactoryPerson(FactoryPersonType factoryPersonType) {
        this.factoryPerson = factoryPersonType.getInstance();
    }

    public Person create(){
        return this.factoryPerson.create();
    }
}
