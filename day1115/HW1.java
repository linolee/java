package day1115;
/*
����
1. ������ �Ҵ�� ���� ����϶��� 2������ ����ϰ� ������� ~�� ����Ͽ�
    ����� �����ϰ� �Էµ� �״���� 10������ ���.
    ��� ��)  "��� �ΰ��"  10 ��(��)  1010
                 "���� �ΰ��"  -10 ��(��) 10


*/
   
class  HW1{
	public static void main(String[] args) {
		int i = 111;
		System.out.println(i+"��(��) "+(i > 0  ? Integer.toBinaryString(i) : ~i+1));
	}
}
