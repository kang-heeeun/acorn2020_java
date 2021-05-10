package test.study;

public class main02 extends main03{
	
	public int alley = 0;//다른프로젝트안에서도O
	int yard = 0; //default int yard, 같은프로젝트안에서O
	protected int toilet = 100;//같은프로젝트안에서O
	private int bag = 1;
	
	//접근제어지시자
	public static void main(String[] args) {
		main03 father = new main03();
		//public int
		//int
		//protected int
		//bags는 아빠의 가방의 참조값을 가리킨다
		int bags = father.getBag();
		
		main04 grandFather = new main04();
		//public int
		//int
		//protected int
		
	}
}
