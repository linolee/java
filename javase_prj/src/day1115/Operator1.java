package day1115;
/*
 ���� ������(unary
 	~, !, +, ++,, --
*/

class Operator1 
{
	public static void main(String[] args) {
		int i = 11;
		int j = -11;
		//~(tilde) : 1�� ���� ����
		//~��� : ��ȣ���� 1 ����
		System.out.println("~"+i+"="+~i); //-12
		//~���� : ��ȣ���� 1 ����
		System.out.println("~"+j+"="+~j); //10

		//!(NOT) : true -> false, false -> ture
		boolean t = true;
		boolean f = false;
		System.out.println("!"+t+"="+!t);
		System.out.println("!"+f+"="+!f);
		System.out.println(!(11>15));
		// + : ������ ����
		System.out.println("-"+i+"="+ +i);
			System.out.println("-"+i+"="+ +i);
		// - : 2�� ���� ����, ��ȣ �ٲ� ����
		System.out.println("-"+i+"="+-i);
		System.out.println("-"+j+"="+-j);
		

		//���� ���� (���ü�� ���� 1�� ����)
		i = 0;
		j = 10;
		//���� ���� : ������ ���ü;
		++i;//0->1
		--j;//10 ->9
		
		System.out.println("�������� �� : i="+i+", j= "+j);
		i++; // 1->2
		j--; // 9->8
		System.out.println("�������� �� : i="+i+", j= "+j);
		//���� �����ڿ� ���� �����ڴ� ���Կ����ڿ� �Բ� ���Ǹ� ������ ������ �ٸ� ���� �����Ѵ�
		j = 0;
		//���� : ���� ����
		j = ++i;
		System.out.println("�������� �� : i="+i+", ���� j= "+j);

		j = 0;
		//���� : ���� ����
		j = i++;
		System.out.println("�������� �� : i="+i+", ���� j= "+j);




	}//main
}//class
