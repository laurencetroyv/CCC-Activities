package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr_numbers[] = {-4, 22, -3, -5, 9, 8, 20 , 19, 16, 10, 5, 4, 1, 30, 25};
		sort(arr_numbers);

		for (int i : arr_numbers) {
			System.out.print(i + " ");
		}
	}

	static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int index = arr[i];
			int x = i - 1;

			while (x >= 0 && arr[x]> index) {
				arr[x+1] = arr[x];
				x= x-1;
			}

			arr[x+1] = index;
		}
	}

}
