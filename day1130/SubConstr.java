package day1130;

//public class SubConstr extends SuperConstr{
//	int i;
//	public SubConstr() {
//		this(200);
//		System.out.println("자식의 기본생성자");
//	}
//	public SubConstr(int i) {
//		super(300);
//		System.out.println("자식의 인자 생성자 "+i);
//	}
//}
public class SubConstr extends SuperConstr{
	int i;
	public SubConstr() {
		super();
		System.out.println("자식의 기본생성자");
	}
	public SubConstr(int i) {
		this();
		System.out.println("자식의 인자 생성자 "+i);
	}
}
