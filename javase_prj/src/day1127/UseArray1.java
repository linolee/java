package day1127;

/**
 * �� �ϳ��� �������� ������ �迭<br>
 * �迭 - �޸𸮿� ���� ������������ ������ ��������.<br>
 * ������ ��������, ����������<br>
 * �ϰ�ó���� ���<br>
 * ���� ���� ���(�迭��.length)<br>
 * 1���� �迭�� ������ ������� ���
 * @author owner
 */
public class UseArray1 {
	public UseArray1() {
		//1.�迭����)��������[]�迭�� = null;
		int[] arr=null;
		//2.�迭����)�迭�� = new ��������[�ε��� ��]
		//�迭�� �����ϸ� ��� ���� ���� �ʱ�ȭ�ȴ�.
		arr = new int[6];
		//1+2.����� ����)��������[] �迭�� = new ��������[�ε��� ��]
		int[] arr1 = new int[8];
		System.out.println(arr+"/"+arr1);
		System.out.println("arr�迭 ���� ���� "+arr.length+", arr1�迭 ���� ���� "+arr1.length);
		//3.���Ҵ�)�迭��[�ε���]=��;
		arr[0]=11;
		arr[1]=27;
		arr[2]=14;
		arr[3]=46;
		//4.�����)�迭��[�ε���]
		System.out.printf("arr[0] = %d, arr[1] = %d, arr[2] = %d, arr[3] = %d, arr[4] = %d, arr[5] = %d \n",
				arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
		//�ϰ�ó��
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"/");
		}
		System.out.println();
		
	}//UseArry1
	/**
	 * 1���� �迭�� �⺻�� ���� ���(new x)
	 */
	public void arrayPrimitive() {
		System.out.println("===============�⺻�� ������ ���================");
		//1.���� : ��������[]�迭��={��,,,,,,,}
		int[] arr = {2018,11,27,15,20};
		System.out.println("�ε��� �� : "+arr.length);
		int[] arr1 = new int[] {1,2,3,4,5,6,7};//�ε��� ���� ���� �����ϸ� error
		System.out.println("arr1 �ε��� �� : "+arr1.length);
		
		arr[0] = 2019;
		System.out.println(arr[0]+"/"+arr[1]);
		
		for (int i = 0; i<arr.length;i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		//���� for : �迭�̳� Collection(List,Set)�� ó�� ����� ������� ��� ���� ���� ���������� �ս��� ����� �� 
		//for (�迭���� ���� ������ ���� : �迭){
		//������
		//}
		for(int value : arr) {
			System.out.println(value);
		}
		System.out.println("����");
		for(int i = arr1.length-1;i>-1;i--) {
			System.out.print(arr1[i]);
		}
		
	}//arrayPrimitive
	
	public static void main(String[] args) {
//		UseArray1 ua = new UseArray1();
		new UseArray1();
		new UseArray1().arrayPrimitive();
	}//main

}//class
