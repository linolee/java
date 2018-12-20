package day1123;

/**
 * 마카펜을 구현한 클래스를 사용하는 클래스<br>
 * 4.객체 생성<br>
 * 5.생성된 객체 사용<br>
 * @author owner
 */
public class UseMarker {

	public static void main(String[] args) {
		//검은색 마카펜 1개 생성
		Marker black = new Marker();
//		black.setColor("검은색");
//		black.setBody(1);
//		black.setCap(1);
		
		System.out.printf("생성된 마카펜 색[%s], 뚜껑[%d], 몸체[%d]\n",
				black.getColor(),black.getCap(),black.getBody());
		//생성된 객체의 사용
		System.out.println(black.write("안녕하세요"));
		
		Marker Red = new Marker("빨간색", 5, 5);
//		Red.setColor("빨간색");
////		Red.color = "무지개색";
//		Red.setBody(5);
//		Red.setCap(5);
//		
//		Red.getColor();
//		Red.getBody();
//		Red.getCap();
		
		
		System.out.println(Red.write("너의 이름"));
	}//main

}//class
