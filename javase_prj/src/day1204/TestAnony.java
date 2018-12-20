package day1204;



/**
 * 인터페이스가 method의 매개변수일 때 간단하게 사용하는 방법.<br>
 * 1회용. 재사용이 되지 않는다.
 * @author owner
 */
public class TestAnony {
	public void useAnonyInter(AnonyInter ai) {
		System.out.println(ai.getMsg()+" "+ai.getName());
	}
	public static void main(String[] args) {
//		AnonyInter ai = new AnonyInter();//인터페이스는 객체화 x
		//인터페이스가 매개변수일 때
		//1.인터페이스를 구현한 클래스를 생성
		//2.구현클래스로 객체를 생성
		AnonyInter ai = new AnonyImpl();
		//3.매개변수를 가진 method를 호출하기 위해 객체 생성
		TestAnony ta = new TestAnony();
		//4.method 호출
		ta.useAnonyInter(ai);
		
		System.out.println("------------anonymous innerclass------------");
		
		ta.useAnonyInter(new AnonyInter() {
			
			
			@Override
			public String getName() {
				return "응슷응"+Test();
			}
			
			@Override
			public String getMsg() {
				return "응븝읍";
			}
			public String Test() {
				return "자식 method";
			}
		});
	
		
		
		
	}//main

}//class
