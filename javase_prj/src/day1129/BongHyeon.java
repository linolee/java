package day1129;


public class BongHyeon extends Person {
	public void hide() {
		System.out.println("사라짐");
	}
	public void sleep() {
		int flag;
		flag = (int)(Math.random()*100);
		
		if (flag > 70) {
			System.out.println("강사님의 눈을 피해 숙면을 취했다.");
			setName("컨디션이 좋은 봉현");
		}else {
			System.out.println("잠을 자지 못했다.");
			setName("피곤한 봉현");
		}
	}
}
