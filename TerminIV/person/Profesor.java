package TerminIV.person;

import TerminIV.person.Person;

public class Profesor extends Person {

    String className;

    public Profesor(String firstName, String lastName, String className) {
        super(firstName, lastName);
        this.className=className;
    }

    @Override
    public void show() {
        System.out.println("Profesor: " + firstName+" "+lastName+" "+className);
    }
}
