package test.study;

/*
 * public class
 * 한개의 .java파일에서느 class가 여러개 존재할수있다
 * java파일안에 public class가 존재한다면, java파일의 이름과 동일하게 사용해야된다
 * 하나의 파일에서 public class는 하나만 존재한다
 * 
 */
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class MySub01 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t1.channel = 7;
		System.out.println(t1.channel);
	}
}
