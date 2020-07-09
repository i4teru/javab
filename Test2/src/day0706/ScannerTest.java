package day0706;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째:");
		int first = sc.nextInt();
		System.out.print("두번째:");
		int second = sc.nextInt();
		double avg = (first+second)/2.0;
		System.out.println("평균은 ="+avg);

	}

}
