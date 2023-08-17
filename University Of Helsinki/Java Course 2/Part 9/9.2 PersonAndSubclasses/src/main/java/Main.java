
/*
1. Person
Create a class Person.

2. Student
Create a class Student, which inherits the class Person.

At creation, a student has 0 study credits. Every time a student studies, the
amount of study credits goes up.

3. Student's toString
In the previous task, Studentinherits the toString method from the class Person.
However, you can also overwrite an inherited method, replacing it with your own
version. Write a version of toString method specifically for the Student class.

4. Teacher
Create a class Teacher, which inherits the class Person.

5. List all Persons
Write a method public static void printPersons(ArrayList<Person> persons) in the
Main class. The method prints all the persons on the list given as the parameter.
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//1
//        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
//        System.out.println(ada);
//        System.out.println(esko);

//2
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        System.out.println("Study credits " + ollie.credits());
//        ollie.study();
//        System.out.println("Study credits " + ollie.credits());

//3
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//        System.out.println(ollie);
//        ollie.study();
//        System.out.println(ollie);

//4
//        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
//        System.out.println(ada);
//        System.out.println(esko);
//
//        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//        int i = 0;
//        while (i < 25) {
//            ollie.study();
//            i = i + 1;
//        }
//        System.out.println(ollie);

//5
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    }//end main\

    public static void printPersons(ArrayList<Person> persons) {

        for (Person e : persons) {

            System.out.println(e);

        }//end for

    }//end printPersons

    /*
    Example of output
    1
    Ada Lovelace
      24 Maddox St. London W1S 2QN
    Esko Ukkonen
      Mannerheimintie 15 00100 Helsinki
    
    2
    Ollie
      6381 Hollywood Blvd. Los Angeles 90028 
    Study credits 0
    Study credits 1
    
    3
    Ollie
      6381 Hollywood Blvd. Los Angeles 90028 
      Study credits 0
    Ollie
      6381 Hollywood Blvd. Los Angeles 90028 
      Study credits 1
    
    4
    Ada Lovelace
      24 Maddox St. London W1S 2QN 
      salary 1200 euro/month
    Esko Ukkonen
      Mannerheimintie 15 00100 Helsinki 
      salary 5400 euro/month
    Ollie
      6381 Hollywood Blvd. Los Angeles 90028 
      Study credits 25
    
    5
    Ada Lovelace
      24 Maddox St. London W1S 2QN 
      salary 1200 euro/month
    Ollie
      6381 Hollywood Blvd. Los Angeles 90028 
      Study credits 0
     */
    
}//end class
