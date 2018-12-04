package day1119;

/*
 2. 이름, 교통수단과 출퇴근 거리를 입력받아 아래와 같이 출력하세요.
   교통수단은 "버스,지하철,택시,도보"로 제한한다.
   버스요금 1200원, 지하철 요금 1250원, 택시요금 3800원 입니다.
   요금은 10키로 까지는 기본요금, 매 5키로 초과시 마다 100원씩 증가 합니다.

 출력   :  xxx님 출퇴근 교통수단은 xx이며 거리는 xx 키로 입니다.
            편도 이용 요금 xx원이고, 왕복이용 요금 xx원이며, 한달 20일기준
            교통비는 총: xxxx원 입니다.  
 */
public class HW2 {

	public static void main(String[] args) {
		int distance = Integer.parseInt(args[2]);
		int zero_charge = 0; //교통수단별 기본요금
		double dis_charge = 0; //거리당 추가 요금
		
		if (distance > 10) {
			dis_charge = 100*Math.ceil((double)(distance - 10) / (double)5);
		}//거리당 추가요금
		
		int how;// 교통수단별 코드 버스1/지하철2/택시3/도보0
		if (args[1].equals("버스")) {
			how = 1;
		}else if(args[1].equals("지하철")){
			how = 2;
		}else if(args[1].equals("택시")){
			how = 3;
		}else if(args[1].equals("지하철")){
			how = 0;
		}else{
			how = 999;
		}//end if
		switch(how) {
		case 1 : 
			zero_charge = 1200;  
			break;
		case 2 : 
			zero_charge = 1250;  
			break;
		case 3 : 
			zero_charge = 3800;  
			break;
		case 0 : 
			zero_charge = 0;
			dis_charge = 0;
			break;
		default : 
			zero_charge = 9999;
			break;
		}//case
		
		if (zero_charge == 9999){
			System.out.println("교통수단이 잘못되었습니다.");
		}else {
			System.out.println(args[0]+"님 출퇴근 교통수단은 "+args[1]+"이며 거리는 "+distance+" 키로 입니다. 편도 이용 요금 "
					+(int)(zero_charge+dis_charge)+"원이고, 왕복이용 요금 "+(int)(zero_charge+dis_charge)*2+"원이며, 한달 20일기준 교통비는 총 "+(int)(zero_charge+dis_charge)*2*20+"원 입니다.  ");
		}
		
		
			
	
		
		
		
		
		
	}//main

}//class
