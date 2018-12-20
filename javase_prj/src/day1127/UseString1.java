package day1127;

public class UseString1 {
	//email을 입력받아 이메일의 유효성을 검증하여 boolean형으로 결과를 만들어 반환하는 일
//	email.substring(0, email.indexOf("@"))
//	email.substring(email.indexOf("@")+1)
	private boolean IsEmail(String email) {
		
		boolean flag = false;
		
		if ((email.indexOf("@") != -1) &&(email.indexOf(".") != -1)&&(email.indexOf("@")>4) &&(email.indexOf("@")<email.indexOf("."))) {
			flag = true;
		}
		return flag;		
	}//IsEmail
	
	//'시군구'형태의 주소를 n개 입력받아 서울시인지 아닌지를 판단하여 출력하는 method
	private void IsSeoul(String... add ) {
		
		for (int i=0; i<add.length; i++) {
			if (add[i].startsWith("서울시")) {
				System.out.println(add[i]+"는 서울시가 맞습니다.");
			}else {
				System.out.println(add[i]+"는 서울시가 아닙니다.");
			}//end if
		}//end for
	}//IsSeoul
	
	
	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		
		System.out.println(us1.IsEmail("linolee@naver.com"));
		System.out.println(us1.IsEmail("lino@naver.com"));
		System.out.println(us1.IsEmail("linoeenaver.com"));
		System.out.println(us1.IsEmail("linoee.naver@com"));
		
		us1.IsSeoul("서울시 동작구 흑석동", "포항시 북구 두호동", "서울시 여러분 담배꽁초", " 서울시 ");
		
		
	}//main

}//class
