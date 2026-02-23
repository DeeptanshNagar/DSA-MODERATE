import java.util.Arrays;

public class patternREC {
	public static void main(String[] args) {
		// triangle2(4, 0);
		int[] arr = {4, 3, 1, 2};
		bubbleSort(arr, arr.length - 1, 0);
		System.out.println(Arrays.toString(arr));
	}

	static void triangle2(int r, int c) {
		if(r == 0) {
			return;
		}

		if(c < r) {
			triangle2(r, c + 1);
			System.out.print("*");
		} else {
			triangle2(r - 1, 0);
			System.out.println("");
		}
	} 

	static void triangle(int r, int c) {
		if(r == 0) {
			return;
		}

		if(c < r) {
			System.out.print("*" + " ");
			triangle(r, c + 1);
		} else {
			System.out.println();
			triangle(r - 1, 0);
		}
	}

	static void bubbleSort(int[] arr, int r, int c) {
		if(r == 0) {
			return;
		}

		if(c < r) {
			if(arr[c] > arr[c + 1]) {
				int temp = arr[c];
				arr[c] = arr[c + 1];
				arr[c + 1] = temp;
			}

			bubbleSort(arr, r, c + 1);

		} else {
			bubbleSort(arr, r - 1, 0);
		}
		
	}
}