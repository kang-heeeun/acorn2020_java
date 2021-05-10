package test.study;
//객체 - 다양한 소재(자료, 함수)가 집합되어 있는곳
// 객체 === "복합"자료구조
//리터럴 - 변수나 상수에 저장하는 값 자체
/*
 * 변수 
 * -값을바꿀수 있다
 * 
 * 상수
 * -값을바꿀수 없다
 * e)final int b = 3;
 */

/*
 * 1.기본타입(Primitive type)
 * -정수, 실수, 논리  OR 정수, 문자, 실수, 논리
 * 2.참조타입(Reference type)
 * -클래스, 인터페이스, 배열
 * 자료형
 * 1.숫자
 * -정수 : 소수점이아닌것들 1, 2, -1 ...
 * e) int, long, byte, short
 * 
 * -실수 : 1.0, 2.1 ...
 * e) float, double
 * 
 * 2.문자 
 * e) char
 * 
 * 3.논리
 * e) boolean
 * 
 */
/*
 * 반복
 * 1.for
 * 2.while
 * 3.do ~ while
 */
/*
 * 배열
 * []
 */
/* 
 *  접근제어지시자
 */
public class main01 {
	public static void main(String[] args) {
		//정수
		int jungsu1 = 1;
		int jungsu2 = 1;
		long l = 1;
		byte b = 1;
		short s = 1;
		
		//실수
		double silsu1 = 1.0;
		//float silsu2 = 1.1f;
		//float silsu2 = (float)1.1;
		//실수형 리터럴은 기본적으로 double형이기 때문에
		//float자료형으로 쓰고 싶어라고 꼭 명시해야된다
		/*
		 * 변수는 전부 사용이 가능하지만 
		 * 상수에서는 int, double만 사용가능하다
		 * 정수에선 - int
		 * 실수에선  - double
		 */
		
		String s = "몬스터를 만났다"; //class, char를갖다쓴
		char c = '친';
		
		//연산
		int sum = (jungsu1 + jungsu2) * 3;
		
		//논리  -참, 거짓( true, false)
		boolean bbb = false;
		if(bbb) {
			
		}else {
			
		}
		
		//반복문
		for(int i=0; i<10; i++) {
			//1변수를 2될때까지 3이렇게해라
		}
		
		int[] arrayA = new int[5]; //0~4
		//int array[]도가능 하지만 int[] array방식선호
		for(int i : arrayA) {
			//2에서 1꺼내오기
		}
		
		while(bbb) {
			//얘가 이렇게 될때 수행해
		}
		
		do {
			
		} while(bbb);
		
			
	}
}










