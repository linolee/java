package day1203;

public class UseDefaultMethod implements UseDefault {

	@Override
	public void test() {
		System.out.println("Override method");
	}

	public static void main(String[] args) {
		//자식클래스 객체화
		UseDefaultMethod udm = new UseDefaultMethod();
		udm.test();
		udm.temp();
		
		//is a 관계 객체화
		UseDefault ud = new UseDefaultMethod();
		ud.test();//override한 method가 호출
		ud.temp();
	}

}
