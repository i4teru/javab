package day0709;

import java.util.Arrays;

public class Array00 {

	public static void main(String[] args) {
		int[] array0; //�迭 ���� 
		array0 = new int[5]; //�迭 ����(���� �޸𸮿� 4byte�� 5�� �ڸ� ����)
		
		int[] array1 = new int[3]; //�̷��� �ѹ��� ���൵ ��.
		int array2[] = new int[2];
		int array3[] = {1,2,3}; //�ٷ� ���� �־��൵ �ȴ�.

		//�߸��� ���
//		int[4] array4 = new int[]; //����! ũ��� �ڿ�
//		int array5[] = new int[]; //����! ũ��� �ݵ�� ��������� ��
	
		//�ʱ�ȭ(�������� new �ϸ� �ڵ� �ʱ�ȭ.. �������̶�� 0)
		int array7[] = new int[] {2,3,4};
//		int array8[]; array8= {2,3,4}; //����! �����ϰ� ũ�� �������� �Ҵ��ϸ� X
//		int array9[] = new int[6] {5,6,7,8,9,1}; //����! ũ��+�Ҵ� ����X
		
		//���1) �ݺ���
		for(int i=0;i<array3.length;i++) {
			System.out.println("array3["+i+"]="+array3[i]);
		}
		
		//���2) for~each 
		for(int temp:array7) {
			System.out.print(temp+" ");
		}
		
		//���3) Arrays.toString(�迭�̸�)
		System.out.println(Arrays.toString(array7));
		
		//���ٿ� �迭 ������ �����ϱ� 
		int[] data1, data2, data3;
		int data4[], data5, data6;
		
		//�迭�� ��� �ִ� ���� ���� �ƴ϶� �ּҰ�
		data4 = new int[10];
		System.out.println(data4); 
		System.out.println(data4[0]); //new�ϸ� 0���� �ʱ�ȭ
		
		//�迭 �����ϱ�
		data1 = new int[] {2,5,6,7,2,3,4,4};
		data4 = data1;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		data1[4] = 33;
		System.out.println("data1:"+data1+" "+Arrays.toString(data1));
		System.out.println("data4:"+data4+" "+Arrays.toString(data4));
		
		
		
		
		

	}//main end

}//class end
