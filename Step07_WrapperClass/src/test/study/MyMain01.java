package test.study;

public class MyMain01 {
	public static void main(String[] args) {
		int num1 = 10; //기본데이터
		Integer num2 = 10; //참조데이터 Interger도 하나의 class이다
		
		//숫자를 문자로 바꾸기
		String strNum = num2.toString(); //참조데이터여서 기능이있다
		
		//문자를 숫자로 바꾸기
		int num3 = Integer.parseInt("999");
	}
}
