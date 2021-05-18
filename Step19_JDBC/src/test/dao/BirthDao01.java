package test.dao;

import java.util.List;

import test.dto.BirthDto;

public class BirthDao01 {
	//2. 자신의 참조값을 저장할 static 필드 정의
	private static BirthDao01 dao;
	
	//1. 외부에서 객체생성하지 못하도록
	private BirthDao01() {}
	
	//3. 자신의 참조값을 리턴해주는 공개 static 메소드
	public static BirthDao01 getInstance() {
		//최초 호출될때는 dao가 null이므로
		if(dao == null) {
			//객체를 생성해서 static 필드에 저장해 놓는다
			dao = new BirthDao01(); //클래스 안에서는 private 접근지정자로 된 생성자 호출가ㅡㄴㅇ
		}
		return dao;
	}
	//생일 정보를 저장하는 메소드(작업성공 여부는 boolean 으로 리턴)
	public boolean insert(BirthDto dto) {
		return false; //임시로 리턴
	}
	//생일 정보를 수정하는 메소드
	public boolean update(BirthDto dto){
		return false;
	}
	//생일 정보를 삭제하는 메소드
	public boolean delete(int num){
		return false;
	}
	//한명의 생일 정보를 리턴하는 메소드
	public BirthDto getData(int num) {
		return null;
	}
	//모든 생일정보를 리턴하는 메소드 //List<BirthDto>
	public List<BirthDto> getList(){
		return null;
	}
}
