package test.mypac;

public class MemberInfo {
	//필드는매소드에서 사용하는 부품들을 담고있다
	//부품이 공개가되어있다?
	//부품들의값을 자유롭게 바꿀수있음
	//잘못된값을 넣으면 정상동작을 못할수도있음
	//공개하지않는게 맞음 => 필드는 보통 private로지정(특별한이유가아니라면)
	
	//필드
	public int num;
	public String name;
	public String addr;
	
	//default 생성자
	public MemberInfo() {}
	
	//생성자의 인자로 번호,이름,주소를 전달 받을수 있도록 한다.
	public MemberInfo(int num, String name, String addr) {
		//생성자의 인자로 전달된 값을 필드에 저장한다.
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}









