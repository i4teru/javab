package day0708;

import java.util.Scanner;

public abstract class ReverseNumber2 {

	public static void main(String[] args) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.print("세자리 숫자를 입력하세요:");
        int su = scan.nextInt();
        while(true) {
        	a=su%10;
        	su=su/10;
        	System.out.print(a);
        	if(su==0) break;
        }
        scan.close();
	}//main end
}//class end
