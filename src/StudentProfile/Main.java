package StudentProfile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = scan.next();

        System.out.print("Enter Student Address: ");
        String studentAddress = scan.next();

        System.out.print("Enter Student Age: ");
        int studentAge = scan.nextInt();

        System.out.print("Enter Student ID: ");
        int studentID = scan.nextInt();

        StudentProfile profile = new StudentProfile(studentName, studentAddress, studentAge, studentID);

        profile.increment();
        System.out.print(profile.studentAge);

        scan.close();
    }
}
