package ex_240426;

class Sample {
	public int a; 
	private int b = 100;
	int c;
	public int getB() {
		return b;
	}
	
	
}

public class AccessTest {

	public static void main(String[] args) {
		Sample sample = new Sample();
		//sample.b = 3;
		int result = sample.getB();
		System.out.println("result : " + result);
		
		// 	public int a; 
		// 값 직접 접근이 가능해서, 읽기, 쓰기도 됨. 
		// 직접쓰기
		sample.a = 200;
		// 직접 읽기
		System.out.println("sample.a 의 값 : " + sample.a);

	}

}





