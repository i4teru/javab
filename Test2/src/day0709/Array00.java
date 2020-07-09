package day0709;

import java.util.Arrays;

public class Array00 {

	public static void main(String[] args) {
		int[] array0; //배열 선언 
		array0 = new int[5]; //배열 생성(실제 메모리에 4byte씩 5개 자리 잡힘)
		
		int[] array1 = new int[3]; //이렇게 한번에 해줘도 됨.
		int array2[] = new int[2];
		int array3[] = {1,2,3}; //바로 값을 넣어줘도 된다.

		//잘못된 경우
//		int[4] array4 = new int[]; //에러! 크기는 뒤에
//		int array5[] = new int[]; //에러! 크기는 반드시 지정해줘야 함
	
		//초기화(참조형은 new 하면 자동 초기화.. 정수형이라면 0)
		int array7[] = new int[] {2,3,4};
//		int array8[]; array8= {2,3,4}; //에러! 선언하고 크기 지정없이 할당하면 X
//		int array9[] = new int[6] {5,6,7,8,9,1}; //에러! 크기+할당 동시X
		
		//출력1) 반복문
		for(int i=0;i<array3.length;i++) {
			System.out.println("array3["+i+"]="+array3[i]);
		}
		
		//출력2) for~each 
		for(int temp:array7) {
			System.out.print(temp+" ");
		}
		
		//출력3) Arrays.toString(배열이름)
		System.out.println(Arrays.toString(array7));
		
		//한줄에 배열 여러개 선언하기 
		int[] data1, data2, data3;
		int data4[], data5, data6;
		
		//배열이 담고 있는 것은 값이 아니라 주소값
		data4 = new int[10];
		System.out.println(data4); 
		System.out.println(data4[0]); //new하면 0으로 초기화
		
		//배열 복사하기
		data1 = new int[] {2,5,6,7,2,3,4,4};
		data4 = data1;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		data1[4] = 33;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		
		
		
		

	}//main end

}//class end
