package day1123;

/**
 * 사람을 추상화하여 만든 Person 클래스를 사용하는 클래스
 * @author owner
 */
public class UsePerson {

	public static void main(String[] args) {
		//객체 생성 : heap에 생성되고 instance 변수는 자동 초기화
		Person teacksung = new Person();
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n", 
				teacksung.getEye(), teacksung.getNose(), teacksung.getMouth(), teacksung.getName());
		
		teacksung.setEye(2);
		teacksung.setNose(1);
		teacksung.setMouth(1);
		teacksung.setName("정택성");
		
		System.out.format("생성된 사람 객체 정보 눈[%d], 코[%d], 입[%d], 이름[%s]\n", 
				teacksung.getEye(), teacksung.getNose(), teacksung.getMouth(), teacksung.getName());
		//생성된 객체에서 정의된 일을 사용.
		System.out.println(teacksung.eat());
		System.out.println(teacksung.eat("치킨", 15000));
		
		Person jinban = new Person();
		jinban.setName("천진반");
		jinban.setEye(3);
		jinban.setNose(1);
		jinban.setMouth(1);
		
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("선두",1));
	}//main

}//class
