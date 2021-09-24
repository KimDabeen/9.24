package classPart;

public class FuctionTest {

	public static void main(String[] args) {
		//2개의 값을 더하여 출력하는 함수를 구현한다.
		int num1;
		int num2;
		num1 = 10;
		num2 = 20;
		
		// add함수의 결과값을 정수 sum이라는 변수에 저장한다.
		int sum = add(num1, num2);
		int sum1 = oper4Kinds('*',num1, num2);
		
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다." );
	}
	//들어온 2개의 정수형 매개변수를 더하여 출력하는 add함수를 만든다.
	public static int add(int n1, int n2) {
		int result = n1 + n2 ;
		return result;
	}
	private static int oper4Kinds(char kind, int n1, int n2) {
		switch(kind) { //이렇게 더하고 빼는 기능을 한번에 만들면 좋지 않다.
		case '+':
			return n1 + n2;
		case '-':
			return n1 - n2;
		}
		return 0;
		
	}
	
	

}
