public class Nto1 {
	public static void main(String[] args) {
		funRev(5);
	}
	static void funRev(int n) {
		if(n == 0) {
			return;
		}
		funRev(n  - 1);
		System.out.println(n);
	}
}


// public class Nto1 {
// 	public static void main(String[] args) {
// 		fun(5);
// 	}
// 	static void fun(int n) {
// 		// if(n == 1) {
// 		// 	System.out.println("1");
// 		// 	return;
// 		// }
// 		if(n == 0) {
// 			return;
// 		}
// 		System.out.println(n);
// 		fun(n  - 1);
// 	}
// }



// public class Nto1 {
// 	public static void main(String[] args) {
// 		fun(5);
// 	}
// 	static void fun(int n) {
// 		if(n == 1) {
// 			System.out.println("1");
// 			return;
// 		}
// 		System.out.println(n);
// 		fun(n - 1);
// 	}
// }
