package day1127;

public class UseHW1 {

	public static void main(String[] args) {

		String ssn = "880101-1234568";
		HW1 hw1 = new HW1(ssn);
		if (hw1.checklenSSN()) {
			if (hw1.checkhyphenSSN()) {
				if(hw1.checkRealSSN()) {
					System.out.println(hw1.returnBirth());//1.5
					System.out.println(hw1.returnAge());//1.6
					System.out.println(hw1.returnGender());//1.7
					System.out.println(hw1.returnNational());//1.8
					System.out.println(hw1.returnAnimal());//1.9
				}else {
					System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
				}//1.4
			}else {
				System.out.println("- ��ġ�� �߸��Ǿ����ϴ�.");
			}//1.3
		}else {
			System.out.println("�ֹι�ȣ ���̰� �߸��Ǿ����ϴ�.");
		}//1.2
		
		String ssn1 = "121212-1234567";
		HW2 hw2 = new HW2(ssn1);
		if (hw2.checklenSSN()) {
			if (hw2.checkhyphenSSN()) {
				if(hw2.checkRealSSN()) {
					System.out.println(hw2.returnBirth());//1.5
					System.out.println(hw2.returnAge());//1.6
					System.out.println(hw2.returnGender());//1.7
					System.out.println(hw2.returnNational());//1.8
					System.out.println(hw2.returnAnimal());//1.9
				}else {
					System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
				}//1.4
			}else {
				System.out.println("- ��ġ�� �߸��Ǿ����ϴ�.");
			}//1.3
		}else {
			System.out.println("�ֹι�ȣ ���̰� �߸��Ǿ����ϴ�.");
		}//1.2
		
		
		
		
		
		
		
		
		
		
	}

}
