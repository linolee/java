package day1205;

/**
 * StringBuffer, StringBuilder(JDK1.5~) 문자열을 heap에 저장하고 사용하는 클래스
 * 
 * @author owner
 */
public class UseStringBuilder {

	public void useStringBuffer() {
		// 1.클래스 생성
		StringBuffer sb = new StringBuffer();
		// 2.값추가
		sb.append("오늘은 ");// 문자열
		sb.append(12);// 정수
		sb.append("월 5일").append(" 수요일입니다.");
		System.out.println(sb);
		System.out.println(sb.indexOf("은"));
		// 3.값삽입
		sb.insert(4, "2018년 ");
		System.out.println(sb);
		// 4.값삭제 : delete(시작인덱스, 끝인덱스+1)
		sb.delete(3, 9);
		System.out.println(sb);
	}

	public void useStringBuilder() {
		// 1.클래스 생성
		StringBuilder sb = new StringBuilder();
		// 2.값추가
		sb.append("오늘은 ");// 문자열
		sb.append(12);// 정수
		sb.append("월 5일").append(" 수요일입니다.");
		System.out.println(sb);
		System.out.println(sb.indexOf("은"));
		// 3.값삽입
		sb.insert(4, "2018년 ");
		System.out.println(sb);
		// 4.값삭제 : delete(시작인덱스, 끝인덱스+1)
		sb.delete(3, 9);
		System.out.println(sb);
	}

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();

		usb.useStringBuffer();
		System.out.println("================================");
		usb.useStringBuilder();

	}

}