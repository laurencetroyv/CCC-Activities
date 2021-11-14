//Submitted By: Laurence Troy Valdez
public class Main {
    public static void main(String[] args) {
        laboratory3();
        System.out.println();
    }

    static void laboratory1() {
        int arr_yearsMarried[]  = new int[5];

        arr_yearsMarried[0] = 4;
        arr_yearsMarried[1] = 3;
        arr_yearsMarried[2] = 10;
        arr_yearsMarried[3] = 12;
        arr_yearsMarried[4] = 6;

        System.out.println("Family 1 has been married for " + arr_yearsMarried[0] + " years");
        System.out.println("Family 2 has been married for " + arr_yearsMarried[1] + " years");
        System.out.println("Family 3 has been married for " + arr_yearsMarried[2] + " years");
        System.out.println("Family 4 has been married for " + arr_yearsMarried[3] + " years");
        System.out.println("Family 5 has been married for " + arr_yearsMarried[4] + " years");
    }

    static void laboratory2() {
        double arr_dailyTemp[] = {87.5, 90.0, 91.2, 88.8, 88.6, 87.5, 89.2};
        
        System.out.println("Mondays Temp was: " + arr_dailyTemp[0] + " Degrees F.");
        System.out.println("Tuesday Temp was: " + arr_dailyTemp[1] + " Degrees F.");
        System.out.println("Wednesday Temp was: " + arr_dailyTemp[2] + " Degrees F.");
        System.out.println("Thursday Temp was: " + arr_dailyTemp[3] + " Degrees F.");
        System.out.println("Friday Temp was: " + arr_dailyTemp[4] + " Degrees F.");
        System.out.println("Saturday Temp was: " + arr_dailyTemp[5] + " Degrees F.");
        System.out.println("Sunday Temp was: " + arr_dailyTemp[6] + " Degrees F.");
    }

    static void laboratory3() {
        int arr_squares[] = new int[100];

        for (int i = 0; i < 100; i++) {
            arr_squares[i] = i * i;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("The square of " + i + " is " + arr_squares[i]);
        }
    }
}   