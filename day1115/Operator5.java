package day1115;
/*
��������
    �Ϲ� �� : �������� ���� �����ڸ� ���� ��
        && (and)    ���װ� ������ ��� ���� ���� �� ��ȯ
                ������ false�̸� ������ ������� �ʴ´�.
        || (or)           ���װ� ������ ��� ������ ���� ���� ��ȯ
                ������ true�̸� ������ ������� �ʴ´�.

    ��Ʈ �� : ��Ʈ�� ��ġ�ų� �и��� �� ���
        & (and)        ������Ʈ/������Ʈ �� �� 1�� ���� 1
        | (or)              ������Ʈ/������Ʈ �� �� 0�� ���� 0
        ^ (xor)       ������Ʈ/������Ʈ �� �� �ϳ��� 1�� ���� 1

*/

class Operator5{
	public static void main(String[] args) {
		boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;
		int i, j = 0;


		System.out.println("----------------------&&----------------------");
		
			
		
		System.out.println(flag1+"&&"+flag3+"="+(flag1 && flag3));
		System.out.println(flag1+"&&"+flag2+"="+(flag1 && flag2));
		System.out.println(flag2+"&&"+flag1+"="+(flag2 && flag1));
		System.out.println(flag2+"&&"+flag4+"="+(flag2 && flag4));


		System.out.println("----------------------||----------------------");



		System.out.println(flag1+"||"+flag3+"="+(flag1 || flag3));
		System.out.println(flag1+"||"+flag2+"="+(flag1 || flag2));
		System.out.println(flag2+"||"+flag1+"="+(flag2 || flag1));
		System.out.println(flag2+"||"+flag4+"="+(flag2 || flag4));

		flag1 = false;
		flag2 = false;
		flag3 = false;
		

		flag3 = (flag1 = 3>4) && (flag2=5<4);
		System.out.println("���� : "+flag1+", ���� : "+flag3+", ���� : "+flag3);


		System.out.println("----------------------&|^----------------------");

		System.out.println(9&3);
		System.out.println(9|3);
		System.out.println(9^3);

		System.out.println("----------------------------------------------");
		i = 28;  //11100
		j = 48;	//110000
		//10000 = 16
		System.out.println(i+" & "+j+" = "+(i&j));
		i = 16; // 10000
		j = 3;	// 00011
		//10011 = 19
		System.out.println(i+" | "+j+" = "+(i|j));
		i = 10; // 1010
		j = 12; // 1100
		// 110 = 6
		System.out.println(i+" ^ "+j+" = "+(i^j));

	}//main
}//class
