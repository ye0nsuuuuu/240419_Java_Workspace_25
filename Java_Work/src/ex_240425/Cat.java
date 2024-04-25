package ex_240425;

public class Cat extends Animal{
	private String place;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	
	//생성자 만들기. 
	// Cat 의 부모 클래스는 Animal 
	// 자식은 부모 꺼 사용할려면, 부모꺼 먼저 초기화 해야 한다. 
	public Cat() {
		// super() = Animal() 호출하는 것과 동일함. 
		super(); // 부모의 기본 생성자를 호출 하는 키워드
		// TODO Auto-generated constructor stub
	}
	
	

}






