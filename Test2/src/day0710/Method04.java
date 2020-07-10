package day0710;

import java.util.Scanner;

public class Method04 {

	static int add(int x, int y) {
		int result;
		result = x + y;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = add(a, b); // add 메소드 호출
		System.out.println(a + "+" + b + "=" + c);
		sc.close();
	}// main end

}// class end
