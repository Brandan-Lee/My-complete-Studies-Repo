
/*
Two classes, Person and Pet, are included in the exercise template. Each
person has one pet. Modify the public String toString method of the Person
class so that the string it returns tells the pet's name and breed in
addition to the person's own name.
*/

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);

        System.out.println(leo);
    }
}
