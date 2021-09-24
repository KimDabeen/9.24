package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person 홍길동 = new Person(); //생성자도 함수다.
									// 생성되어있는 Person클래스가 불려온다.
		홍길동.setName("홍길동");
		홍길동.setHeight(199);
		System.out.println(홍길동);
	
		
		Person lee = new Person("이순신"); //Person클래스에 입력받은 이순신을 넣어서 출력한다.
		System.out.println(lee);
		
		Person me = new Person("김다빈", 150, 55); //Person클래스에 입력받은 이순신을 넣어서 출력한다.
		System.out.println(me);
	}

}
