import java.util.Scanner;

public class Finals {

    static int smallest_Integers = Integer.MAX_VALUE;
    static int largest_Integers = Integer.MIN_VALUE;
    static double average = 0;
    static int inputs, sum_of_Integers, count_of_Inputs, old_number;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter list of Non-negative Integers. Enter any Negative inputs will stop the program."
                + "\nEnter few integers:");
        while (true) {
            inputs = scan.nextInt();

            if (inputs <= -1) {
                System.out.print("End Of Input\n");
                break;
            } else {
                count_of_Inputs++;
            }

            small_and_Big();

            sum_of_Integers += inputs;
            average = (average / count_of_Inputs);
        }
        outputs();
        scan.close();
    }

    static void small_and_Big() {
        if (old_number != inputs) {
            old_number = inputs;
            if (inputs < smallest_Integers) {
                smallest_Integers = inputs;
            }
            if (inputs > largest_Integers) {
                largest_Integers = inputs;
            }
        }
    }

    static void outputs() {
        System.out.println("\n\tOutputs!" + "\nYou have " + count_of_Inputs + " Inputs"
                + "\nThe smallest number you have entered is : " + smallest_Integers
                + "\nThe largest number you have entered is : " + largest_Integers + "\nThe total sum is : "
                + sum_of_Integers + "\nThe total average is : " + average);
    }
}