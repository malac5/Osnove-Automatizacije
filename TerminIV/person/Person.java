package TerminIV.person;

public class Person {


    String firstName;
    String lastName;
  //int age;
  //int height;
  //int weight;

    public Person (String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void show() {
        System.out.println("Person: "+ firstName+" "+lastName);
    }

  //void sleep(){}
  //void run(){}

}
