package test.study;

import java.io.InputStream;
import java.util.Scanner;

public class MyMain02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		/*
		 * 콘솔창으로 사용자 입력을 받아서 활용하고 싶다면?
		 * Scanner 객체를 생성해서 메소드를 이용해야한다
		 * 
		 */
		//콘솔창으로 부터 입력받을수 있는 객체의 참조값을 is 라는 지역 변수에 담기
		//InputStream is = System.in; // in => static field 참조
		//Scanner scan = new Scanner(is);
		//위의 두줄을 한줄의 code로 작성을 하면
		Scanner scan2 = new Scanner(System.in);
		
		System.out.print("문자열 입력:");
		
		String str = scan2.nextLine();
		System.out.println("str:" + str);
	}
}
