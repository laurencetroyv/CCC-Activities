package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr_numbers[] = {-4, 22, -3, -5, 9, 8, 20 , 19, 16, 10, 5, 4, 1, 30, 25};
		sort(arr_numbers, 0, arr_numbers.length-1);

		for (int i : arr_numbers) {
			System.out.print(i + " ");
		}
	}

	static void sort(int[] arr, int left, int right) {
		if(left < right) {
			int middle = (left + right)/ 2;

			sort(arr, left, middle);
			sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}

	static void merge (int arr[], int left, int middle, int right) {
        int side1 = middle - left + 1;
        int side2 = right - middle;

        int arr_left[] = new int[side1];
        int arr_right[] = new int[side2];

        for (int i = 0; i < side1; ++i)
            arr_left[i] = arr[left + i];

        for (int j = 0; j < side2; ++j)
            arr_right[j] = arr[middle + 1 + j];

        int i = 0;
        int x = 0;
        int y = left;

        while (i < side1 && x < side2) {
            if (arr_left[i] <= arr_right[x]) {
                arr[y] = arr_left[i];
                i++;
            } else {
                arr[y] = arr_right[x];
                x++;
            }
            y++;
        }

        while (i < side1) {
            arr[y] = arr_left[i];
            i++;
            y++;
        }

        while (x < side2) {
            arr[y] = arr_right[x];
            x++;
            y++;
        }
    }
}