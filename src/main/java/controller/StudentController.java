package controller;

import entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<Student>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter EnrolID: ");
        String EnrolID = scanner.nextLine();
        System.out.println("Enter FirstName: ");
        String FirstName = scanner.nextLine();
        System.out.println("Enter LastName: ");
        String LastName = scanner.nextLine();
        System.out.println("Enter Age: ");
        String Age = scanner.nextLine();
        Student student = new Student(EnrolID, FirstName, LastName, Age);
        list.add(student);
    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/resources/students.dat");
        fileWriter.write("EnrolID\t" + "      " + "FullName\t" + "       " + "Age" + "\n");
        fileWriter.write("--------"+" "+"---------------------"+" "+"---"+"\n");
        for (Student student :
                list) {
            fileWriter.write(student.getEnrollID() + "      " + student.getFirstName() + " " + student.getLastNmae() + "    " + student.getAge() + "\n");
        }
        fileWriter.close();
    }

    public void Display() throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/students.dat");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

    }
}
