package org.example;

public class Unemployed extends Person {
    public Unemployed(String name){super(name);}

    @Override
    public String toString() {
        return "Unemployed" + super.toString();
    }
}
