package day0708;

public class LoopWithLabel {

	public static void main(String[] args) {
		outer: for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(j==2) break outer;
				System.out.println(i+"\t"+j);	
			}
			
		}

	}

}
