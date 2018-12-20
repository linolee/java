package day1203;

public class UseInstance {

	public TestSuper test1() {
		//is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method
		//부모클래스명 객체명 = new 자식클래스 생성자();
		TestSuper ts = new TestSub();
		return ts; 
	}
	public TestSuper test2() {
		//is a 관계의 객체화 : 부모의 자원과 자식이 Override한 method
		//부모클래스명 객체명 = new 자식클래스 생성자();
		TestSuper ts = new TestSub2();
		return ts; 
	}
	
	public static void main(String[] args) {
		//자식클래스를 객체로 생성하여 사용.
		//자식클래스명 객체명 = new 자식의 생성자();
		//객체로 사용 : 부모클래스의 변수, method, 자식클래스의 변수 , method
		
		TestSub ts = new TestSub();
		ts.i= 100;//부모와 같은 이름의 변수는 자식의 것을 사용
		ts.pMethod();//부모의 method 사용
		ts.subMethod();//자식의 method 사용
		ts.printI();//자식이 override한 method
		
		System.out.println("=======부모의 이름으로 객체화 : 객체 다형성==========");
		//객체 다형성 : 같은 이름의 객체를 다양하게 사용하는 것
		//부모클래스명 객체명 = new 자식클래스명  =>  부모클래스에서 자식의 override 된 method 사용
		//부모만 사용할 줄 알면 된다.
		UseInstance ui = new UseInstance();
		
		
		TestSuper ts1 = ui.test1();
		TestSuper ts2 = ui.test2();
		
		ts1.printI();//overide한 method호출
		ts2.printI();
		
		 
		
		
	}//main

}//class
