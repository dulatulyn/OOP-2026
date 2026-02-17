package lab3.problem2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1.Person 2.Student 3.Staff 4.Print 0.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                people.add(new Person(name, address));
            }

            if (choice == 2) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                String program = sc.nextLine();
                int year = sc.nextInt();
                double fee = sc.nextDouble();
                sc.nextLine();
                people.add(new Student(name, address, program, year, fee));
            }

            if (choice == 3) {
                String name = sc.nextLine();
                String address = sc.nextLine();
                String school = sc.nextLine();
                double pay = sc.nextDouble();
                sc.nextLine();
                people.add(new Staff(name, address, school, pay));
            }

            if (choice == 4) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

        } while (choice != 0);
    }
}