package chapter03;

public class RectTest {
	
	public static void main(String []args){
		
		Rect r1 = new Rect(10,20);
		Rect r2 = new Rect(10,20);
		
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2)+"\n"); //이퀄스가 오버라이드 되지않아서  false가 뜸
		
		
	}

}
