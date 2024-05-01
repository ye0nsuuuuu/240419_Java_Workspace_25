package ex_240501;

class Person { // 암묵적으로 Object 클래스를 상속 받고 있다. 
	private String name, email;

	public Person(String name, String email) {
		// 생성자, 매개변수2개
	super();
	this.name = name;
	this.email = email;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// toString 아직 재정의 안했음. toString 메서드를 부모꺼를 사용합니다. 
	// Object 클래스의 toString 이상한 메모리 주솟값이 나와서 활용이 잘 안되니. 
	// 실제 값을 출력하는 toString 메서드 이름으로 기능만 재정의하자. 

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	
	
}

public class ObjectMethodTest {

	public static void main(String[] args) {
		Person p1 = new Person("이상용","lsy@naver.com");
		//Object 의 toString 메서드 임. 
		// toString 을 재정의하고 나서 출력 함. 
		String result = p1.toString();
//		System.out.println("Object 의 toString 이용해서 출력한 결과 : " + result);
		System.out.println("Person 의 toString 이용해서 출력한 결과 : " + result);
	}

}






