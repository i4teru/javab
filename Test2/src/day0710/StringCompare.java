package day0710;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		
		if(s1 == s2)
			System.out.println("same");
		else 
			System.out.println("different");
		
		String s3 = new String("hello");
		String s4 = new String("hello");
	
		if(s3 == s4)
			System.out.println("same");
		else
	        System.out.println("different");
		
		if(s3.equals(s4))
			System.out.println("same");
		else 
			System.out.println("different");

	}//main end

}//class end
