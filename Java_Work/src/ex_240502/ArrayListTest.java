package ex_240502;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import util.dto.LunchFood;

public class ArrayListTest {

	public static void main(String[] args) {
		// 점심 메뉴 모델(전달용) DTO(Data Transfer Object) 클래스
		// VO(Value Object) , 데이터베이스와 연관된 클래스.
		// DTO 한번 작성해보기.
		// public LunchFood
		// (int foodPrice, LocalDate foodRegDate, LocalDate foodmodDate,
		// String foodLocator, String foodName) {
		// LocalDate 한번 사용해보기.
		// LocalDate currentDate = LocalDate.now();
		// 년,월,일 표현
		LocalDate currentDate = LocalDate.now();

		// 년,월,일, 시,분,초 -> 포맷팅도 다하게끔.
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String nowString = now.format(dateTimeFormatter);
		// 확인.
		System.out.println(nowString);

		// 메뉴 추가하기.
		LunchFood lunchFood = new LunchFood(9000, nowString, nowString, "서면", "김치찌개");
		// 확인
		System.out.println(lunchFood.toString());

	}

}
