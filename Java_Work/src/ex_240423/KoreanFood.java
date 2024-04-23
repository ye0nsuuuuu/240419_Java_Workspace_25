package ex_240423;

public class KoreanFood {
	// 설계도면으로 사용할 예정. 
	// 객체 -> 수납도구 -> 멤버와 함수를 가지고 있다. 
	// 멤버, 메서드를 가지고 있다. 
	private String foodName;
	private int foodPrice;
	private String foodPlace;
	
	// 방법1
	// getter/setter 라는 것을 추가하기. 
	// 반자동( 코드 스니펫으로 자동 만들기.)
	// 우클릭 -> Source 메뉴 -> Generate getters and setters.. 클릭. 
	// 멤버를 선택하는 창 나옴. -> 모두 선택 -> 게터 세터를 모두 선택하자. 
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodPlace() {
		return foodPlace;
	}
	public void setFoodPlace(String foodPlace) {
		this.foodPlace = foodPlace;
	}
	
	
	// 방법2, lombok 라이브러리 이용. 
	// 메모리상에, getters, setters, toString, Data, 등. 

	// 생성자 만들기. 클래스 설계도면으로 사용하죠. 
	// 객체(인스턴스)를 생성해주는 역할,
	// 단순, 복수, 
	// 매개변수가 3개인 생성자로 만들기. 
	// 참고로 생성자 기본 문법은, 클래스명과 동일하고, 메서드와는 다름.
	
	// 반자동으로 생성.
	// 우클릭 -> Source 메뉴 -> Generate Constructor Field... 클릭.
	// 창 
	
	public KoreanFood(String foodName, int foodPrice, String foodPlace) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodPlace = foodPlace;
	}
	
	
	
	
	
	
}
