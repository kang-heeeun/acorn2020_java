package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		//키보드와 연결된 InputStrem type 의 참조값을 kbd 라는 지역변수에 담기 
		//InputStream 객체는 1byte 단위 처리 스트림 이다.
		//영문자 대소문자, 숫자, 특수문자만 처리할수 있다. 
		//한글 처리 불가 
		InputStream kbd=System.in;
		//System.in 을 이용하며 콘솔 입력을 얻을 수 있다
		//System.in은 InputStream의 객체임을 알 수 있다
		//InputStream은 자바의 내장 클래스이다
		//자바의 내장 클래스중에 java.lang 패키지에 속해 있지 않은 클래스는 필요할때 항상 import시켜야된다
		//입력값을 받아오기위한 연결작업 / 중간역할을 하는 스트림! 입출력이 있는곳이면 어디서든 동작!
		//스트림은 한방향으로만 통신할수 있으므로, 입력과 출력을 동시에 처리불가능
		//사용목적에 따라 입력스트림 , 출력스트림으로 구분한다
		System.out.println("입력:");
		try {
			int code=kbd.read(); //입력한 키의 코드값 읽어오기 
			char ch=(char)code; //코드값에 대응되는 문자 얻어내기
			
			System.out.println("code:"+code); //입력한 키의 코드값 출력
			System.out.println("char:"+ch); //코드값에 대응되는 문자 출력
			
		} catch (IOException e) {
			// IOException (String  s)
			// 상세 메세지를 지정해 IOException을 구축합니다
			// 파일 입출력시에 실제로 파일이 없거나 네트워크 I/O시에 발생
			
			e.printStackTrace();
		}
	}
}
/*
 * InputStream //byte
 * InputStreamReader //String
 * BufferedReader //String
 * FileInputStream //byte
 * FileReader //String
 */
/*
 * OutputStream //byte
 * OutputStramWriter //String
 * BufferedWriter //String
 * FileOutputStream //byte
 * FileWriter //String 
 */





