package day0708;

import java.util.Scanner;

public abstract class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ܾ �Է��ϼ���:");
        String str = scan.nextLine();
        for(int i=str.length(); i>0; i--) {
            System.out.print(str.charAt(i-1));
        }
        scan.close();
	}

}
