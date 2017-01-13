package chapter03;

public class EqualsTest {

	public static void main(String[] args) {
		//point객체 비교
		//equals, hashcode 오버라이딩 안된 경우
		Point pt1 = new Point(10,20);
		Point pt2 = new Point(10,20);
		Point pt3=pt2;
		
		//==연산자에서 두개의 항이 객체 참조 변수인 경우에는
		// 두 객체의 동일여부를 보고 판단
		System.out.println(pt1==pt2); //동일하지 않기 때문에 false값이 나온다
		System.out.println((pt2==pt3)+"\n");

		
		//동질성 비교시에는 == 대신에 equals 메소드를 사용해야한다.
		System.out.println(pt1.equals(pt2)); 
		System.out.println(pt2.equals(pt3)+"\n");
		
		//equals가 오버라이딩이 안된 클래스의 객체의 equals비교는
		//==완전히 같다 
		
		/*
		 String 객체 비교
		 equals, hashCode 오버라이딩이 되어있는 경우 
		 */
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 =s2;
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2)); //내옹기반
		System.out.println(s2.equals(s3)+"\n");
		
		//hashcode비교
		System.out.println(s1.hashCode()); //해시코드가 같다라는건 다같이 오버라이드가 되었다는 뜻 (내용으로 오버라이드가 되었다는 뜻)(string을 사용할때만)(그 내용이달라지니간 해싱코드가 달라짐)
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode()+"\n");
		
		//참조값(객체ID)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3)+"\n");
		
		//객체의 내용을 기반으로 해싱코드를 오버라이딩을하면
		//참조변수가 가직 있는 참조값과 틀린값을 가지게 된다.
		
		
		String s4 = new String("hello");
		String s5 = new String("Hello");
		String s6 =s5;
		
		System.out.println(s4.hashCode()); //해시코드가 같다라는건 다같이 오버라이드가 되었다는 뜻 (내용으로 오버라이드가 되었다는 뜻)(string을 사용할때만)(그 내용이달라지니간 해싱코드가 달라짐)
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode()+"\n");
		
		/*
		 * 리터럴을 사용하는 경우
		 * jvm안의 리터럴 풀에서 객체생성을 관리하기 때문에
		 * 문자열의 해싱값이 같은 문자열 객체는 2개이상 만들지 않는다.
		 */
		
		String str1="hello"; //이건 new String ()같은 객체에 값이 들어가는게 아니라, 리터럴 풀에 저장되는것 (jav에서 따로 제공하는)
		String str2="hello";
		String str3=str2;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
	}

}
