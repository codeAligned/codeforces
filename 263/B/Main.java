import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solve(a, k));

		sc.close();
	}

	static String solve(int[] a, int k) {
		if (k > a.length) {
			return "-1";
		}

		a = Arrays.stream(a).boxed().sorted().mapToInt(x -> x).toArray();

		return String.format("0 %d", a[a.length - k]);
	}
}
