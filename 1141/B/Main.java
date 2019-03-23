import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solve(a));

		sc.close();
	}

	static int solve(int[] a) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < a.length * 2; i++) {
			if (a[i % a.length] == 1) {
				count++;

				result = Math.max(result, count);
			} else {
				count = 0;
			}
		}
		return result;
	}
}
