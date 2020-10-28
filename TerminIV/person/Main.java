package TerminIV.person;

public class Main {
    public static void main(String[] args) {
   //Person person = new Person();
   //person.firstName="John";
   //person.lastName="Smith";
   //person.age=27;
   //person.height=172;
   //person.weight=72;
   //person.run();

   //Student student = new Student();
   //student.firstName="Pera";

   //  Kalkulator kalkulator=new Kalkulator(5,4);
   //  kalkulator.add(kalkulator.broj1,kalkulator.broj2);
   //  kalkulator.mul(3,4);


    //Student student=new Student("Pera", "Peric","20/2014");
    //student.firstName="Mile";
    //System.out.println(student);

      Person person=new Person("Pera","Peric");
      Student student=new Student("Mile","Milic","20/2017");
      Profesor profesor=new Profesor("Vasa","Vasic","Java");

      person.show();
      student.show();
      profesor.show();




    }
}
