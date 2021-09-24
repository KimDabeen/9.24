package sfd;

public class SayHello {

	public static void main(String[] args) { //문자열 배열이고 이름은 args
		if (args.length > 0) { //적어도 args에 하나 이상의 값이 들어있다면
			System.out.println(args[0] + "님 안녕하세요."); 
			// SayHello 클래스 우클릭 -> argument에 홍길동이라고 값을 넣음
		}
	}

}
