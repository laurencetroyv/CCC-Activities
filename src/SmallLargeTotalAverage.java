import java.util.Scanner;

public class SmallLargeTotalAverage {
    public static void main(String[] args) {

        int smallest = Integer.MAX_VALUE;
        int largest = 0;
        int number;
        double totalAvg = 0;
        double totalSum = 0;
        int count = 0;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter few integers (Enter negative numbers to end input) :");
        while (true) {
            number = kb.nextInt();


            if (number <= -1) {
                System.out.println("End Of Input");
                break;
            }
            else {
                count = count + 1;
            }

            if (number < smallest) {
                smallest = number;
            }



            if (number > largest){
                largest = number;
            }

            totalSum = totalSum + number;
            totalAvg = (totalSum / count);

        }

        System.out.println("The smallest number you have entered is : " + smallest);
        System.out.println("The largest number you have entered is : " + largest);
        System.out.println("The total sum is : " + totalSum);
        System.out.println("The total average is : " + totalAvg);
        System.out.println("Count : " + count);
        kb.close();
    }
}