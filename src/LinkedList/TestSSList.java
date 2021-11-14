package LinkedList;

import java.util.Scanner;

import LinkedList.Assignment1.*;

public class TestSSList {
    final static Scanner scan = new Scanner(System.in);
    final static SLList list = new SLList();

    public static void main(String[] args) {
        System.out.println("--------------------" + "\n1. add last " + "\n2. get first " + "\n3. get last "
                + "\n4. delete last" + "\n5. delete all " + "\n6. size " + "\n7. lastindexof " + "\n8. firstindexof "
                + "\n9. printAll \n10. exit"+"\n--------------------\n");

        boolean condition = true;
        while (condition) {
            System.out.print("Selected Choice: ");
            byte answer = scan.nextByte();
            switch (answer) {
                case 1:
                    addLast();
                    break;
                case 2:
                    System.out.println(caseSix());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    caseSix();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    printAll();
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid number!");
                    scan.close();
            }
        }
    }

    public static void addLast() {
        System.out.print("Add last: ");
        list.addLast(scan.next());
    }

    public static int caseSix() {
        System.out.println(list.size());
        return list.size();
    }

    public static void printAll() {
        list.printAll(System.out);
    }
}
