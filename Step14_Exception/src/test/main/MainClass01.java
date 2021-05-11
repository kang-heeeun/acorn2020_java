package test.main;

import java.util.Scanner;

/*
 * try ~ catch //예외가 발생하면 처리
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 입력:");
		//숫자 형식의 문자열을 입력 받는다.  "10" "20" "10.1" 등등
		String inputNum=scan.nextLine();
		try {
			//입력한 숫자를 실제 숫자로 바꾼다.
			double num=Double.parseDouble(inputNum);
			//입력한 숫자에 100 을 더한다.
			double result=num+100;
			System.out.println("입력한 숫자 + 100 : "+result);
		}catch(NumberFormatException nfe) { // nfe 지역변수
			System.out.println("Oops! 숫자 형식에 맞게 입력 하세요.");
			//예외 메세지 얻어내서 콘솔창에 출력
			String msg = nfe.getMessage();
			System.out.println(msg);
			
			//예외 정보를 콘솔창에 출력하기
			nfe.printStackTrace(); //예외정보를 자동으로 콘솔창에 출력
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}








