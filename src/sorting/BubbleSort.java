package sorting;
public class BubbleSort {

	public static void main(String[] args) {
		int arr_numbers[] = {-4, 22, -3, -5, 9, 8, 20 , 19, 16, 10, 5, 4, 1, 30, 25};
		sort(arr_numbers);

		for (int i : arr_numbers) {
			System.out.print(i + " ");
		}
	}

	static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int x = 0; x < arr.length-i-1; x++) {
				if (arr[x] > arr[x+1]) {
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
	}
}