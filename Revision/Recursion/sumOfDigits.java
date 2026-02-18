// public class sumOfDigits {
// 	public static void main(String[] args) {
// 		System.out.println(sum(13762));
// 	}

// 	static int sum(int n) {
// 		if(n == 0) {
// 			return 0;
// 		}
// 		return (n % 10) + sum(n / 10);
// 	}
// }

// multiplication of digits
public class sumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(13762));
	}

	static int sum(int n) {
		if(n%10 == n) {
			return n;
		}
		return (n % 10) * sum(n / 10);
	}
}