package day1127;

public class UseString1 {
	//email�� �Է¹޾� �̸����� ��ȿ���� �����Ͽ� boolean������ ����� ����� ��ȯ�ϴ� ��
//	email.substring(0, email.indexOf("@"))
//	email.substring(email.indexOf("@")+1)
	private boolean IsEmail(String email) {
		
		boolean flag = false;
		
		if ((email.indexOf("@") != -1) &&(email.indexOf(".") != -1)&&(email.indexOf("@")>4) &&(email.indexOf("@")<email.indexOf("."))) {
			flag = true;
		}
		return flag;		
	}//IsEmail
	
	//'�ñ���'������ �ּҸ� n�� �Է¹޾� ��������� �ƴ����� �Ǵ��Ͽ� ����ϴ� method
	private void IsSeoul(String... add ) {
		
		for (int i=0; i<add.length; i++) {
			if (add[i].startsWith("�����")) {
				System.out.println(add[i]+"�� ����ð� �½��ϴ�.");
			}else {
				System.out.println(add[i]+"�� ����ð� �ƴմϴ�.");
			}//end if
		}//end for
	}//IsSeoul
	
	
	public static void main(String[] args) {
		UseString1 us1 = new UseString1();
		
		System.out.println(us1.IsEmail("linolee@naver.com"));
		System.out.println(us1.IsEmail("lino@naver.com"));
		System.out.println(us1.IsEmail("linoeenaver.com"));
		System.out.println(us1.IsEmail("linoee.naver@com"));
		
		us1.IsSeoul("����� ���۱� �漮��", "���׽� �ϱ� ��ȣ��", "����� ������ ������", " ����� ");
		
		
	}//main

}//class
