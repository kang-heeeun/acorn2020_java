package test.mypac;

public class Info {
	//필드
	public int num;
	public String name;
	public String addr;
}
/*
 * --접근가능범위--
 * public > protected > default > private
 * 
 * ***생성자, 필드, 메소드 접근지정자
 * public - 무조건공개필드(어디서든지 접근가능)
 * X (default) - 같은 패키지
 * protected - 같은 패키지 공개 or 상속관계에서자식에게 공개
 * private - 비공개필드(나만쓰겟다/ class안에서 / 같은객체안에서)
 * 
 * 
 * ***class의접근지정자
 * public / default
 * 
 */