import java.util.ArrayList;

public class linearSearchR {
	public static void main(String[] args) {
		int[] arr = {2, 3, 6, 7, 88, 12, 12, 33};
		// ArrayList<Integer> ans = findAllIndex2(arr, 12, 0, new ArrayList<>());
		// System.out.println(ans);

		ArrayList<Integer> ans = findAllIndex3(arr, 12, 0);
		System.out.println(ans);
	}

	static boolean searchElement(int[] arr) {
		int target = 88;
		return helper(arr, target, 0);
	}

	static boolean helper(int[] arr, int target, int index) {
		if(index == arr.length) {
			return false;
		}
		return arr[index] == target || helper(arr, target, index + 1);
	}

	static int findIndex(int[] arr, int target, int index) {
		if(index == arr.length) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		} else {
			return findIndex(arr, target, index + 1);
		}
	}

	static int findIndexLast(int[] arr, int target, int index) {
		if(index == -1) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		} else {
			return findIndexLast(arr, target, index - 1);
		}
	}

	static ArrayList<Integer> list = new ArrayList<>();
	static void findAllIndex(int[] arr, int target, int index) {
		if(index == arr.length) {
			return;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		findAllIndex(arr, target, index + 1);
	}

	static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(index == arr.length) {
			return list;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		return findAllIndex2(arr, target, index + 1, list);
	}

	static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();

		if(index == arr.length) {
			return list;
		}

		// add index for that function call only, wont update below or future calls
		if(arr[index] == target) {
			list.add(index);
		}

		ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);
		list.addAll(ansFromBelowCalls);
		return list;
	}
}