package day0708;

public class MultiForTest3 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}// main end

}// class end
