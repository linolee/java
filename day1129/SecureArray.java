package day1129;

/**
 * private�� �� �迭�� public method�� �������� �ܺο��� private�迭 ���� ������ �� �ְ� �ȴ�.<br>
 * �迭�� �����ؼ� return�ϸ� private�� ������ �� �ִ�.
 * @author owner
 */
public class SecureArray {
	private int[] arr= {1,2,3,4,5};
	
	
	
	
	public int[] getArr() {
		//�ܺο��� �� ���� ���� �� ���� �迭�� ���� ������� �ʵ��� �迭�� �����Ͽ� ����
		int[] temp = new int[arr.length];
		for(int i = 0; i <arr.length; i++) {
			temp[i]=arr[i];
		}//end for
		return temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//class
