package day0706;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��°:");
		int first = sc.nextInt();
		System.out.print("�ι�°:");
		int second = sc.nextInt();
		double avg = (first+second)/2.0;
		System.out.println("����� ="+avg);

	}

}
