package day1123;

/**
 * 라면을 객체화
 * 
 * @author owner
 */
public class Ramen {
	private String name;
	private int price;
	private double time;
	private int kcal;
	private int nacl;
	private int water;

	public Ramen() {}// 기본생성자

	public Ramen(String name, int price, double time, int kcal, int nacl, int water) {
		this.name = name;
		this.price = price;
		this.time = time;
		this.kcal = kcal;
		this.nacl = nacl;
		this.water = water;
	}

	/**
	 * 라면의 이름 입력
	 * 
	 * @param name 라면이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 라면의 가격 입력
	 * 
	 * @param price 라면가격(원)
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 라면 끓이는 시간 입력
	 * 
	 * @param time 끓이는 시간(분)
	 */
	public void setTime(double time) {
		this.time = time;
	}

	/**
	 * 라면의 칼로리 입력
	 * 
	 * @param kcal 칼로리(kcal)
	 */
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	/**
	 * 라면의 나트륨 입력
	 * 
	 * @param nacl 나트륨(mg)
	 */
	public void setNacl(int nacl) {
		this.nacl = nacl;
	}

	/**
	 * 라면에 넣는 물 양 입력
	 * 
	 * @param water 물 양(ml)
	 */
	public void setWater(int water) {
		this.water = water;
	}

	/**
	 * 라면이름 반환
	 * 
	 * @return 라면이름
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 라면 가격 반환
	 * 
	 * @return 라면가격
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * 끓이는 시간 반환
	 * 
	 * @return 끓이는 시간
	 */
	public double getTime() {
		return this.time;
	}

	/**
	 * 라면의 칼로리 반환
	 * 
	 * @return 칼로리
	 */
	public int getKcal() {
		return this.kcal;
	}

	/**
	 * 라면의 나트륨 반환
	 * 
	 * @return 나트륨
	 */
	public int getNacl() {
		return this.nacl;
	}

	/**
	 * 라면에 넣는 물 양 반환
	 * 
	 * @return 물 양
	 */
	public int getWater() {
		return this.water;
	}

	/**
	 * 라면을 끓이는데 필요한 물의 양과 적정시간을 표시
	 */
	public void Recipe() {
		System.out.printf("%s은(는) 물 %dmg을 넣고 %2.1f분간 끓입니다.\n", name, water, time);
	}

	/**
	 * 라면의 영양소 표시
	 */
	public void Nutrient() {
		System.out.printf("%s은(는) 나트륨 함량 %dmg, 칼로리 %dKcal입니다. 일일 나트륨 권장량의 ", name, nacl, kcal);
		System.out.println((double) nacl / (double) 20 + "% 에 해당합니다.");
	}

	public void CanIEat(String... ramen) {

	}
}// class
