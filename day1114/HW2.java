package day1114;

/*
2. �⺻�� ���������� �����Ǵ� Ŭ������ Wrapper Class��� �Ѵ�. 
   Java Document���� WrapperŬ������ ����� �����ϴ��� ã�ƺ��� 
   �׿� ���� �ּҰ��� �ִ밪�� ��� �Ѵ�. 
 
   ��� :  byte�� �ּҰ� :  -128  �ִ밪 : 127 
*/
class HW2{
	public static void main(String[] args) {


		System.out.println("byte�� �ּҰ� :  "+Byte.MIN_VALUE+"  �ִ밪 : "+Byte.MAX_VALUE);
		System.out.println(Math.sin(Math.PI));
		System.out.println(Math.E);

		int deci = 15;
		int octal = 017;
		int hex = 0xf;
		long tel = 1111111;
		System.out.println(deci+octal+hex);
		System.out.println(octal);
		System.out.println(hex);
		System.out.println(tel);
	}
}
