package day1123;

public class UseRamen {

	public static void main(String[] args) {
		Ramen nugul = new Ramen();
		Ramen ohzam = new Ramen();
		Ramen shin = new Ramen();

		Ramen zhin = new Ramen("진라면", 750, 4, 500, 1800, 550);
		
		nugul.setName("너구리");
		ohzam.setName("오징어짬뽕");
		shin.setName("신라면");

		nugul.setPrice(900);
		ohzam.setPrice(1000);
		shin.setPrice(800);

		nugul.setKcal(495);
		ohzam.setKcal(510);
		shin.setKcal(500);

		nugul.setNacl(1700);
		ohzam.setNacl(1750);
		shin.setNacl(1790);

		nugul.setWater(500);
		ohzam.setWater(450);
		shin.setWater(450);

		nugul.setTime(4.5);
		ohzam.setTime(4);
		shin.setTime(3.5);
		//각 요소 입력
		nugul.Recipe();
		ohzam.Recipe();
		shin.Recipe();
		zhin.Recipe();
		//레시피 출력
		nugul.Nutrient();
		ohzam.Nutrient();
		shin.Nutrient();
		zhin.Nutrient();
		//영양소 출력 
	}// main

}// class
