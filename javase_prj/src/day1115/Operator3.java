package day1115;
/*
����Ʈ ������
<<	(left shift)	��Ʈ�� �������� �а� �о ��ĭ�� 0���� ä���
>>	(right shift)	��Ʈ�� ���������� �а� �о ��ĭ�� �ֻ�����Ʈ�� ���� ���ڷ� ä���
>>>	(unsigned right shift)	��Ʈ�� ���������� �а� �о ��ĭ�� 0���� ä���
*/
//method : static method ���
//Ŭ������.method��(��)

class Operator3{
	public static void main(String[] args) {
		int i = 11;
		System.out.println(Integer.toBinaryString(i));//1011
		System.out.println(Integer.toOctalString(i));//013		
		System.out.println(Integer.toHexString(i));//0xb	
		
		i = 9; // 1001   ->  1001000  -> 64+8 = 72
		System.out.println(i+"<<3 = " + (i<<3));
		i = 36;// 100100 ->  100 = 4
		System.out.println(i+">>3 = " + (i>>3));
		i= 120;// 1111000 ->   111 = 1+2+4 = 7
		System.out.println(i+">>>4 = " + (i>>>4));
		i = 1;
		System.out.println(i<<31);//�ֻ��� ��ȣ��Ʈ ����
		i = -1;
		System.out.println(i >>100);//�ֻ��� ��ȣ��Ʈ ����
		System.out.println(i >>> 1);
	}//main
}//class