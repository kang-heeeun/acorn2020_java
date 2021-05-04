package test.study;

import java.io.PrintStream;

public class MyMain02 {
	public static void main(String[] args) {
		System.out.println("김구라");
		
		PrintStream a = System.out;
		a.println("해골");
		a.println("원숭이");
		
		long current = System.currentTimeMillis(); //현재시간을 반환
		a.println(current);
		
		String str = new String("안녕하세요"); // String str = "안녕하세요";ㅣ
		
		Car c1 = new Car();
	}
}
