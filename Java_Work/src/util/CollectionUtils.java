package util;

import java.util.Vector;

public class CollectionUtils {
	// Vector의 요소를 출력해주는 메서드 만들기. 
		public static void showVectorElem(Vector<String> vector) {
			for (int i = 0; i < vector.size(); i++) {
				if(i == 0) {
					System.out.print(vector.get(i));	
				} else {
					System.out.print(", " + vector.get(i));	
				}
				
			}
		}
		
}
