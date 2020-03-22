package org.example;

public class Country extends Person{
    public Country(String name){super(name);}

    @Override
    public String toString() { return "Country" + super.toString(); }
}
