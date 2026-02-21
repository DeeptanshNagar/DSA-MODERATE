public class RBSusingREC {
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
		int target = 7;
		int ans = RBS(arr, target,  0, arr.length - 1);
		System.out.println(ans);
		
	}
	static int RBS(int[] arr, int target, int start, int end) {

		if(start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if(target == arr[mid]) {
			return mid;
		}

		if(arr[start] <= arr[mid]) {
			if(arr[start] <= target && target <= arr[mid]) {
				return RBS(arr, target, start, mid - 1);
			} else {
				return RBS(arr, target, mid + 1, end);
			}
		}
		if(target >= arr[mid] && target <= arr[end]) {
			return RBS(arr, target, mid + 1, end);
		}
		return RBS(arr, target, start, mid - 1);
	}
}
