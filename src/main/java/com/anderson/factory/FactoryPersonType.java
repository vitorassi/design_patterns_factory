package com.anderson.factory;

public enum FactoryPersonType {

    EMPLOYEE(new FactoryPersonEmployee()),
    CUSTOMER(new FactoryPersonCustomer()),
    PROVIDER_PRODUCT(new FactoryPersonProviderProduct()),
    PROVIDER_SERVICE(new FactoryPersonProviderService());

    private AbstractFactoryPerson instance;

    FactoryPersonType(AbstractFactoryPerson factoryPerson) {
        this.instance = factoryPerson;
    }

    public AbstractFactoryPerson getInstance() {
        return instance;
    }
}
