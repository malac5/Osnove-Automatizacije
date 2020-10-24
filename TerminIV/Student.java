package TerminIV;

public class Student extends Person {

    String brojIndexa;

    public Student(String firstName, String lastName, String brojIndexa) {
        super(firstName, lastName);
        this.brojIndexa=brojIndexa;
    }

    @Override
    public void show() {
        System.out.println("Student: " + firstName+" "+lastName+" "+brojIndexa);
    }

  //@Override
  //public String toString() {
  //    return "Hello from " +firstName;
  //}
}
