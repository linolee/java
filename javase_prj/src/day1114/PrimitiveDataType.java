package day1114;
/*
�⺻�� ��������
	���� : byte, short, int, long
	���� : char
	�Ǽ� float, double
	�Ҹ�	boolean
*/

class PrimitiveDataType{
	public static void main(String[] args) {
		//������
		byte a = -10;
		short b = 20;
		int c = 30; //���� 4byte �̳��̹Ƿ� literal ��ȯ �ʿ� x
		long d = 2147483648L; // literal�� ������ �ȵǹǷ� literal�� ũ�⸦ ���� �����
		
		System.out.println("byte : "+a+", short : "+b+", int : "+c+", long : "+d);

		//������ : unicode �� : \u0000
		//char f = 'A'; //�Ҵ� unicode
		char f = 66; //unicode�� ���� �Էµ� ����
		char g = '0';
		char h = '��';
		//��� : unicode�� ���� ���ڿ� ���
		System.out.println("char : "+f+","+g+","+h);
		//�Ǽ�
		float i = 6.14f;//����� - �Ǽ� literal�� 8byte�� float ���������� 4byte�̹Ƿ� ���ҵ��� ���� �ʴ´�.
		double j = 3.14;//literal�� ���������� �����Ƿ� ����� ���� ����
		double k = 3.14d;
		System.out.println("float : "+i+" double : "+j+", "+k);
		//boolean
		boolean l = true;
		boolean m = false;
		System.out.println("boolean : "+l+", "+m);

		byte b1 = 10, b2 = 20;
		int result =0 ;
		result = b1*b2;
		System.out.println(result);




	}//main
}//class
