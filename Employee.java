package org.example;

public class Employee extends Person {
    public Employee(String name) {super(name);}

    @Override
    public String toString() { return "Employee" + super.toString(); }
}
