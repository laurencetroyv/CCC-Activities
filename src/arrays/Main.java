package arrays;

public class Main {
	public static void main(String[] args) {
		laboratory9();
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

	static void laboratory4() {
		int arr_revenue[][] = new int [12][2];

		arr_revenue[0][0] = 1;
		arr_revenue[1][0] = 2;
		arr_revenue[2][0] = 3;
		arr_revenue[3][0] = 4;
		arr_revenue[4][0] = 5;
		arr_revenue[5][0] = 6;
		arr_revenue[6][0] = 7;
		arr_revenue[7][0] = 8;
		arr_revenue[8][0] = 9;
		arr_revenue[9][0] = 10;
		arr_revenue[10][0] = 11;
		arr_revenue[11][0] = 12;

		arr_revenue[0][1] = 34;
		arr_revenue[1][1] = 44;
		arr_revenue[2][1] = 23;
		arr_revenue[3][1] = 76;
		arr_revenue[4][1] = 65;
		arr_revenue[5][1] = 98;
		arr_revenue[6][1] = 123;
		arr_revenue[7][1] = 102;
		arr_revenue[8][1] = 87;
		arr_revenue[9][1] = 43;
		arr_revenue[10][1] = 34;
		arr_revenue[11][1] = 12;

		for(int i = 0; i < 12; i++) {
		    System.out.println("for month number " + arr_revenue[i][0] + ", the revenue was: $" + arr_revenue[i][1]);
		}
	}

	static void laboratory5() {
		double[] arr = {332.1, 55.4, 76.4, 88.5, 45.3, 88.8, 76.7};

		for (double element : arr) {
			System.out.println(element);
		}
	}

	static void laboratory6() {
		int[] arr = {12, 43, 54, 2, 7, 33, 65, 4};

		int smallest = arr[0];
		int largest = arr[0];

		for(int i: arr) {
			if(i < smallest) smallest = i;
			if(i > largest) largest = i;
		}

		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The Largest number is: " + largest);
	}

	static void laboratory7() {
		String arr_string1[] = {"Popeye", "the", "sailor", "man"};
		String  arr_string[] = new String[5];

		arr_string[0] = "Here";
		arr_string[1] = "I";
		arr_string[2] = "Come";
		arr_string[3] = "To Save";
		arr_string[4] = "The Day!";

		System.out.println(arr_string1[0] + " " + arr_string1[1] + " " + arr_string1[2] + " " + arr_string1[3]);
		System.out.println(arr_string[0] + " " + arr_string[1] + " " + arr_string[2] + " " + arr_string[3] + " " + arr_string[4]);
	}

	static void laboratory8() {
		String str = "Shelly sells sea shells down by the sea shore";
		System.out.println(str);
		System.out.println("The last match of the word \"sea\" is at index: " + str.lastIndexOf("sea"));
	}

	static void laboratory9() {
		String str = "Humpy Dumpty Sat On The Wall.";

		char arr_chr[] = new char[30];
		str.getChars(0, str.length(), arr_chr, 0);

		System.out.println(str);
		for(int i = arr_chr.length-1; i >= 0; i--) {
			System.out.print(arr_chr[i]);
		}
	}
}