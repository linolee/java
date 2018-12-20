package day1218;


//1.Exception이나 RuntimeException을 상속받는다.
@SuppressWarnings("serial")
public class TobaccoException extends RuntimeException{
	public TobaccoException() {
		this("담배예외 - 폐암의 원인 흡연! 그래도 피우시겠습니까?");
	}
	public TobaccoException(String msg) {
		super(msg);
	}
	
}
