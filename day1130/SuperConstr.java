package day1130;

//public class SuperConstr {
//	int i;
//	
//	public SuperConstr() {
//		System.out.println("�θ��� �⺻ ������");
//	}
//	public SuperConstr(int i) {
//		this();
//		this.i = i;
//		System.out.println("�θ��� ���� ������ "+this.i);
//	}
//}
public class SuperConstr {
	int i;
	
	public SuperConstr() {
		this(100);
		System.out.println("�θ��� �⺻ ������");
	}
	public SuperConstr(int i) {
		this.i = i;
		System.out.println("�θ��� ���� ������ "+this.i);
	}
}
