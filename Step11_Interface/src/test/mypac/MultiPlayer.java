package test.mypac;

public class MultiPlayer implements Remocon, Drill{
	@Override
	public void hole() {
		System.out.println("책상에 구멍을 뚤어요");
	}
	@Override
	public void up() {
		System.out.println("온도를 올려요");
	}
	@Override
	public void down() {
		System.out.println("온도를 내려요");
	}
}
/*
 *  Object mp = new MultiPlayer();
 *  Remocon mp2 = new MultiPlayer();
 *  Drill mp3 = new MultiPlayer();
 *  MultiPlayer mp4 = new MultiPlayer();
 */
/*
 * mp. //object에정의된기능
 * mp2. //Remocon에정의된기능
 * mp3. //Drill에정의된기능
 * mp4. //obj, Remocon, Dril, MultiPlayer 에정의된기능
 * 
*/
