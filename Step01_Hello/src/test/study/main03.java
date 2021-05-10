package test.study;

public class main03 extends main04{
	public int alley = 0;
	int yard = 0;
	protected int toilet = 100;
	private int bag = 1;
	
	//private에 접근할수있는 권한을주는 
	public int getBag() {
		return bag; // return this.bag
	}
	
	public void setBag(int bag) {
		this.bag = bag;
	}
}
