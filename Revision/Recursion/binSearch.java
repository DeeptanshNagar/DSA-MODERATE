public class binSearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int target = 4;
		int start = 0;
		int end = arr.length;
		int ans = binSearch(arr, target, start, end);
		System.out.println(ans);
	}

	static int binSearch(int[] arr, int target, int start, int end) {
		if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binSearch(arr, target, start, mid - 1);
        }

        return binSearch(arr, target, mid + 1, end);
	}
}
