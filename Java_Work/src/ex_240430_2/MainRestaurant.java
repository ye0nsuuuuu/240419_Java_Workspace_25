package ex_240430_2;

public class MainRestaurant {

	public static void main(String[] args) {
		// 확인 , 쌀쌀 국수 
		RiceRiceNoodle lsy = new RiceRiceNoodle();
		System.out.println("이상용 쌀쌀국수 만들기 프로젝트");
		
		lsy.boiledNoodle("5분");
		// 토핑 재료 추가 
		String[] toppingSource = {"고수",
				"양파","숙주","소고기","쪽파","레몬"
				,"마늘"};
		lsy.addTopping(toppingSource);
		
		// 국물 재료 추가 
		String[] soupSource = {"멸치","다시다",
				"월계수","후추","팔각","향신료"};
		
		lsy.makeSoup(soupSource);
		
		// 양념 재료 추가. 
		String[] source = {"칠리","땅콩",
				"고추","호두","물고기소스"};
		lsy.makeSource(source);

	}

}



