package com.arc.s1;

import java.util.Random;

public class RandomTest {
	
	//멤버변수
	//멤버변수 선언 공식
	//접근지정자 그외지정자 데이터타입 변수명
	private Random random;
	
	//생성자
	//생성자 선언 공식
	//접근지정자 클래스명과.동일한.메서드명(매개변수){}
	public RandomTest() {
		//디폴트 생성자(=빈생성자) - 없으면 컴파일러가 알아서 만들어줌
		random = new Random();
	}
	
	//멤버메서드
	//메서드 선언 공식
	//접근지정자 그외지정자 리턴타입 메서드명(매개변수) throws Exception {}
	public void getNum() {
		int num = random.nextInt(10);
		System.out.println(num);
	}
	
}
