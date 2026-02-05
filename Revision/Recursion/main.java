public class main {
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n == 6) {
			System.out.println("6");
			return;
		}
		System.out.println(n);
		print(n + 1);
	}
}
