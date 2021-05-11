package test.main;

import java.util.HashSet;
import java.util.Set;

import test.mypac.Car;
/*
 *   HashSet 은  Set 인터페이스를 구현한 클래스 이다.
 *   
 *   - 순서가 없다.
 *   - key 값도 없다.
 *   - 중복을 허용하지 않는다.
 *   - 어떤 data 를 묶음(집합) 으로 관리하고자 할때 사용한다.
 */
public class MainClass12 {
	public static void main(String[] args) {
		//정수값을 저장할수 있는 HashSet 객체 
		Set<Integer> set1=new HashSet<>();
		// new HashSet();
		// Object, Abstractcollection, AbstractSet, Serializable, 
		// Cloneable, Iterable, Collection, Set
		
		// 0, 1, 2, 3 ..순서있게 관리 => ArrayList => List
		// Key:value, key:value2 => HashMap => Map
		// set(하나의 묶음으로 관리)(무작위)(동일한참조값 2개이상존재하지않음)(value1, value2, value3) => HashSet => Set
		
		set1.add(10);
		set1.add(20);
		set1.add(20);//동일한 참조값을 넣어도 하나만 담는다
		set1.add(30);
		set1.add(30);//동일한 참조값을 넣어도 하나만 담는다
		//문자열을 저장할수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");//동일한 참조값을 넣어도 하나만 담는다
		set2.add("park");//동일한 참조값을 넣어도 하나만 담는다
		//Car 객체를 저장할수 있는 HashSet 객체
		Set<Car> set3=new HashSet<>();
		set3.add(new Car("프라이드"));
		set3.add(new Car("프라이드"));
		set3.add(new Car("소나타"));
		Car car1=new Car("그랜저");
		//Car객체 4개생성
		
		
		set3.add(car1);
		set3.add(car1);//동일한 참조값을 넣어도 하나만 담는다
		//set2.contains(); //어떤데이터가 존재하는지 true / false
	
	}
}












