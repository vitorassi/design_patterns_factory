package com.anderson.factory;

import com.anderson.model.Category;
import com.anderson.model.PersonProvider;
import com.anderson.model.PersonType;

public class FactoryPersonProviderService extends AbstractFactoryPerson {

    @Override
    PersonProvider create() {
         return PersonProvider.builder().personType(PersonType.PROVIDER).category(Category.SERVICE).build();
    }
}
