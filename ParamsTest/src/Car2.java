
public class Car2 {

//	색상
	String color = "";
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
	Car2(){
		
	}
	
	void carInfo() {
		System.out.println("마이 카");
		System.out.println("색상: " + color);
		System.out.println("변속: " + gearType);
		System.out.println("문 갯수: " + door);
	}
	
}
