package mainthread;

import controller.StudentController;

import java.io.IOException;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) throws IOException {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------Menu---------");
            System.out.println("1. Add new student.");
            System.out.println("2. Save.");
            System.out.println("3. Display all students.");
            System.out.println("4. Exit.");
            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addStudent();
                    break;
                case 2:
                    controller.save();
                    break;
                case 3:
                    controller.Display();
                    break;
                case 4:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Choose number in {1,4}.");
                    break;
            }
            if (choice == 4) {
                break;
            }
        }

    }
}
