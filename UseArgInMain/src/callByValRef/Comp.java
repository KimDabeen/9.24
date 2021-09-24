package callByValRef;

public class Comp {
	int age;

	public static void main(String[] args) {
		//Call by value
		int age;
		age = 22;
		
		yearPass(age); //23출력
		yearPass(57); 
		
		System.out.println(age + "이 당신의 나이"); //22출력
		
		Comp cmp = new Comp(); //Comp에 cmp라는 객체를 만든다?? 기본값으로 0입력
		
		Comp idk = new Comp(); //Comp안에 idk라는 객체?가 생긴다.
		System.out.println(idk.age);//새로 생긴 idk에는 age가 0으로 들어가있다.
		//이때 yearpass에 idk를 넣으면 idk.age자체에 1을 더하기 때문에 idk.age값이 1로 바뀐다.
		
		
		yearPass(cmp); //1출력
		System.out.println(cmp.age + "이 당신의 나이"); 
		//1출력 yearpass함수에서 age를 1이 커진값으로 저장했으므로 0이 아닌 1이 출력
	}

	private static void yearPass(int age) {
		//여기서 age는 앞에서 선언한 22가 아니고 메소드에 들어올 매개변수의 이름이다.
		age++; //들어온 매개변수의 값에 1을 더한다.
		System.out.println(age + "이 당신의 나이"); //1이 더해진 매개 변수를 출력한다.
	}
	
	private static void yearPass(Comp obj) { //Comp에 들어있는 obj를 인수로 받는다.
		obj.age++; //Comp안에 있는 애들을 obj라 이름 짓고 그중에서 age값을 가져오겠다.??
		//여기서 age는 새로만들어진 Comp의 객체?안에 들어있는 age를 말하는 것이므로 
		//age++를하면 실제로 age값이 1이 커진 상태로 저장된다.
		System.out.println(obj.age + "이 당신의 나이"); 
	}

}
