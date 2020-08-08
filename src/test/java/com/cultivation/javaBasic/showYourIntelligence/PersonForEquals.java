package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Objects;

@SuppressWarnings("unused")
public class PersonForEquals {
    private final String name;
    private final short yearOfBirth;

    public PersonForEquals(String name, short yearOfBirth) {
        if (name == null) {
            throw new IllegalArgumentException("name is mandatory.");
        }

        if (yearOfBirth <= 1900 || yearOfBirth >= 2019) {
            throw new IllegalArgumentException("year of birth is out of range.");
        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }



    @SuppressWarnings("Contract")
    @Override
    public boolean equals(Object obj) {
        // TODO: please modify the following code to pass the test
        // <--start
        if (this == obj){
            return true;
        }
        if (!(obj instanceof PersonForEquals)){
            return false;
        }
        PersonForEquals personForEquals = (PersonForEquals) obj;
        return this.name.equals(personForEquals.name) && this.yearOfBirth == personForEquals.yearOfBirth;
        // --end-->
    }


    @Override
    public int hashCode() {
        // TODO: please modify the following code to pass the test
        // <--start
            return Objects.hash(name, yearOfBirth);
        // --end-->
    }

}
