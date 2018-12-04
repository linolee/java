package day1126;

/**
 * method를 호출하는 객체의 주소로 변경되어 사용되는 this
 * @author owner
 */
public class ThisKeyword {
	int i;
	/**
	 * parameter의 이름과 instance변수의 이름이 같을 때 this를 사용하지 않고 parameter의 값을 인스턴스 변수로 저장할 때
	 */
	public void UseInstance(int i, ThisKeyword t) {
		t.i = i;//parameter(stack) 변수의 값을 instance(heap) 변수에 할당
		System.out.println(t);
				
	}//UseInstance
	/**
	 * parameter의 이름과 instance 이름이 같을 때마다 객체를 넘기고 받아서 사용하려면 코딩시 불편.<br>
	 * this를 사용 
	 * @param i 입력 정수
	 */
	public void UseThis(int i) {
		//this는 method를 호출하는 객체의 주소로 변신하는 키워드
		//매개변수로 객체를 받을 필요가 없어짐
		this.i = i;
		System.out.println(this);
	}//UseThis
	
	public static void test() {
//		this.i = 10;//static method 안에서는 this keyword를 사용할 수 없다.
	}
	
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		System.out.println("생성된 객체"+tk);
		tk.UseInstance(300, tk);
		System.out.println("전달한 객체의 instance변수의 값 "+ tk.i);
		System.out.println("===============");
		
		tk.UseThis(900);
		System.out.println("this를 사용하여 변경한 인스턴스 변수의 값 "+tk.i);
		
		
	}//main

}//class
