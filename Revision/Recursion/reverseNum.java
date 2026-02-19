public class reverseNum {
	static int sum = 0;
	static void rev1(int n) {
		if(n == 0) {
			return;
		}

		int rem = n % 10;
		sum = sum * 10 + rem;
		rev1(n / 10);
	}
	static int rev2(int n) {
		// sometimes you might need some additional variables in the arguement
		// in that case, you make another function (helper function)
		int digits = (int) (Math.log10(n)) + 1;
		return helper(n, digits);
	}

	static int helper(int n, int digits) {
		if(n % 10 == n) {
			return n;
		}
		int rem = n % 10;
		return rem * (int) (Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
	}
	// 4 * 1000 + rev2(123)
	// 3 * 100  + rev2(12)
	// 2 * 10   + rev2(1)
	// 1

	public static void main(String[] args) {
		// rev2(1234);
		System.out.println(rev2(1234));
		// System.out.println(sum);
	}
}