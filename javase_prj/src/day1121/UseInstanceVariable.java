package day1121;

/**
 * instance(member)����<br>
 * ��ü�� ������ �� �޸�(heap)�� �Ҵ�ǰ� �� �ּҸ� ������ ����(��ü. intance, object)�� ����Ͽ� �����ϴ� ����.<br>
 * �ڵ��ʱ�ȭ�� �ȴ�.  
 * 
 * @author owner
 */
public class UseInstanceVariable {

	int i; //������ �ʱ�ȭ�� 0
	int j;
	double d;//�Ǽ��� �ʱ�ȭ�� 0.0
	char c;// ������ �ʱ�ȭ�� \u0000
	boolean b; //���� �ʱ�ȭ�� false
	String str;//������ �ʱ�ȭ�� null
	UseInstanceVariable jeahyun;
	
	
	public static void main(String[] args) {
		//static ������ ���� ���� �޸𸮿� �ε�ǹǷ�, instance ������ ���� ����� �� ����.
		 
//		i = 300;
		//��üȭ�� �ϸ� ��ü�� �޸�(heap)�� �����ǰ� �� �ּҸ� �޸�(stack)�� �Ҵ�
		//��üȭ ���� : Ŭ������ ��ü�� = new Ŭ������();
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv1 = new UseInstanceVariable();
		System.out.println("��ü ��� (heap �ּ�) "+uiv);
		System.out.println("��ü ��� (heap �ּ�) "+uiv1);
		
		//heap�� ������ instance variable�� ���
		uiv.i = 11;
		uiv.j = 21;
		System.out.println("uiv��ü�� ������� i = "+uiv.i);
		System.out.println("uiv��ü�� instance ���� j = "+uiv.j);
		
		//instance(member) ������ �ڵ� �ʱ�ȭ�ȴ�.
		System.out.println("uiv��ü i : "+uiv1.i+", uiv1 ��ü j :"+ uiv1.j);
		System.out.println("===============�ڵ��ʱ�ȭ��================");
		System.out.println("������ : "+uiv1.i);
		System.out.println("�Ǽ��� : "+uiv1.d);
		System.out.println("������ : "+uiv1.c);
		System.out.println("�Ҹ��� : "+uiv1.b);
		System.out.println("������1 : "+uiv1.str);
		System.out.println("������2 : "+uiv1.jeahyun);
		
		
		
	}//main

}//class
