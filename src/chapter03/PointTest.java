package chapter03;

public class PointTest {

	public static void main(String[] args) {
		Point pt = new Point(100,20);
		
		System.out.println(pt.getClass());
		System.out.println(pt.hashCode());
		
		//pt.getClass().getName()+"@"+pt.hashCode()  로 출력  해쉬코드는 위에꺼는 10진수고 아래껀 16진수
		System.out.println(pt.toString());
		System.out.println(pt+"\n"); //toString을 자동으로 호출하는 것
		
		String s = new String ("hello"); 
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		System.out.println(s.toString()); //hello라고 출력을 되는 걸 보면 오버라이딩 됬다라는 뜻
		System.out.println(s);			  //hello라고 출력을 되는 걸 보면 오버라이딩 됬다라는 뜻
		
		

	}

}
