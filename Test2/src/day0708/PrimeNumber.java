package day0708;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("======= Prime Number =======");
		int cnt;
		for (int i = 1; i <= 100; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
	}// main end
}// class end
