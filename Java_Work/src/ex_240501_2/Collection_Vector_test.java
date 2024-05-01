package ex_240501_2;

import java.util.Vector;

public class Collection_Vector_test {
	

	public static void main(String[] args) {
		// 배열 , 크기 고정, 공간3개에서만 관리를 해야해요. 
		String [] array = new String[3];
		
		// Collection 하위의 Vector 이용하자. 가변 길이로 
		// 기본적인 crud 테스트 해보기. 
		// 기본 문법 : Vector<E> v = new Vector<E>();
		Vector<String> vectorStrings = new Vector<String>();
		System.out.println("Vector의 기본 용량 알아보기 vectorStrings.capacity() : " + vectorStrings.capacity());
		//add 
		vectorStrings.add("초밥");
		
	}

}





