package com.anderson;

import com.anderson.factory.FactoryPerson;
import com.anderson.factory.FactoryPersonType;
import com.anderson.model.Person;

public class Main {

    public static void main(String[] args){

        //CREATE PERSON CUSTOMER
        Person CUSTOMER = new FactoryPerson(FactoryPersonType.CUSTOMER).create();
        System.out.println(CUSTOMER.toString());
        System.out.println("----------------------------");

        // ----------------------------
        //CREATE PERSON EMPLOYEE
        Person EMPLOYEE = new FactoryPerson(FactoryPersonType.EMPLOYEE).create();
        System.out.println(EMPLOYEE.toString());
        System.out.println("----------------------------");

        // ----------------------------
        //CREATE PERSON PROVIDER
        Person PROVIDER_PRODUCT = new FactoryPerson(FactoryPersonType.PROVIDER_PRODUCT).create();
        System.out.println(PROVIDER_PRODUCT.toString());
        System.out.println("----------------------------");


        // ----------------------------
        //CREATE PERSON EMPLOYEE
        Person PROVIDER_SERVICE = new FactoryPerson(FactoryPersonType.PROVIDER_SERVICE).create();
        System.out.println(PROVIDER_SERVICE.toString());
        System.out.println("----------------------------");



    }
}
