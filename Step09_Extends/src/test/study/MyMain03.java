package test.study;

import test.human.Blood;
import test.human.Men;
import test.human.Person;
import test.human.Woman;

public class MyMain03 {
	public static void main(String[] args) {
		//프로그래밍 목적이 걷는것이다 어떻게 하면 걸을 수 있을까?
		/*
		 * Random ran = new Random();
		 * ran.nexrInt()
		 */
		Blood b = new Blood("+", "O형");
		Person p = new Person(b);
		p.walk();
		
		//프로그래밍의 목적이 영화를 보는 것이다! 어떻게 하면 될까?
		Men m = new Men(new Blood("-", "A 형"));
		m.seeMovie();
		
		//프로그래밍의 목적이 책을 읽는 것이다! 어떻게 하면 될까?
		Woman w = new Woman(new Blood("+", "B형"));
		
		w.reading();
		//부모의 메소드 호출해 보기
		w.walk();
		w.study();
		
		//다형성 확인하기
		Person w2 = w;
		Object w3 = w;
		
	}
}
