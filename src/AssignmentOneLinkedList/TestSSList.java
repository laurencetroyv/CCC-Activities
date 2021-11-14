package AssignmentOneLinkedList;

import AssignmentOneLinkedList.LinkedList.SLList;

import java.util.Scanner;

public class TestSSList {
    final static Scanner scan = new Scanner(System.in);
    final static SLList list = new SLList();

    public static void main(String[] args) {
        System.out.println("""
                ---------------------
                | \t\tChoices\t\t|\s
                | 1. add last\t\t|\s
                | 2. get first\t\t|\s
                | 3. get last\t\t|\s
                | 4. delete last\t|\s
                | 5. delete all bug!\t\t|\s
                | 6. size\t\t\t|\s
                | 7. last Index Of\t|\s
                | 8. first Index Of\t|\s
                | 9. print All\t\t|\s
                | 10. add First\t\t|\s
                | 11. find\t\t\t|\s
                | 12. delete\t\t|\s
                | 13. exit\t\t\t|\s
                ---------------------
                """);

        boolean condition = true;
        while (condition) {
            System.out.print("Selected Choice: ");
            byte answer = scan.nextByte();
            switch (answer) {
                case 1:
                    caseOne_AddLast();
                    break;
                case 2:
                    caseTwo_getFirst();
                    break;
                case 3:
                    caseThree_getLast();
                    break;
                case 4:
                    caseFour_deleteLast();
                    break;
                case 5:
                    caseFive_deleteAll();
                    break;
                case 6:
                    caseSix_Size();
                    break;
                case 7:
                    caseSeven_lastIndexOf();
                    break;
                case 8:
                    caseEight_firstIndexOf();
                    break;
                case 9:
                    caseNine_printAll();
                    break;
                case 10:
                    caseTen_addFirst();
                    break;
                case 11:
                    caseEleven_find();
                case 12:
                    caseTwelve_delete();
                    break;
                case 13:
                    System.out.println("Goodbye!");
                    condition = false;
                    break;
                default:
                    System.out.println("Invalid number!");
                    scan.close();
            }
        }
    }

    public static void caseOne_AddLast() {
        System.out.print("Add last element: ");
        list.addLast(scan.next());
    }

    public static void caseTwo_getFirst() {
        System.out.println("First Object in the list: " + list.getFirst());
    }

    private static void caseThree_getLast() {
        System.out.println("Last Object in the list: " + list.getLast());
    }

    public static void caseFour_deleteLast() {
        System.out.println(list.deleteLast());
    }

    public static void caseFive_deleteAll() {
        System.out.print("remove element: ");
        list.deleteAll(scan.next());
    }

    public static void caseSix_Size() {
        System.out.println("AssignmentOneLinkedList.LinkedList Size: " + list.size());
    }

    private static void caseSeven_lastIndexOf() {
        System.out.print("Find number: ");
        int index = list.lastIndexOf(scan.next());
        System.out.println("index of the number is: " + index);
    }

    private static void caseEight_firstIndexOf() {
        System.out.print("Find number: ");
        int index = list.firstIndexOf(scan.next());
        System.out.println("index of the number is: " + index);
    }

    public static void caseNine_printAll() {
        System.out.print("Elements in the list are: ");
        list.printAll(System.out);
        System.out.print('\n');
    }

    public static void caseTen_addFirst() {
        System.out.print("Add first element: ");
        list.addFirst(scan.next());
    }

    public static void caseEleven_find() {
        System.out.print("find element: ");
        System.out.print(list.find(scan.next()));
    }

    public static void caseTwelve_delete() {
        Object delete = scan.next();
        list.delete(delete);
    }
}
