package day1115;
/*
2. 2147483647�� ������ ���� 2byte�� ���� 2byte ���� �и��Ͽ� ����غ�����. 
    ��� ��) ���� 2byte -> 32767
                ���� 2byte -> 65535

*/
class HW2{
	public static void main(String[] args) {
		int i = 2147483647 , temp1 = 0, temp2 = 0;
		temp1 = i >>> 16;
		System.out.println(i+"�� ���� 2byte�� "+temp1);

		temp2 = i << 16;
		temp2 >>>= 16;

//		temp2 = i & 0x0000ffff;

		System.out.println(i+"�� ���� 2byte�� "+temp2);		
		
	}
}
