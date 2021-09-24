package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Course;
import model.Student;
import model.Take;

class Test학사관리 {

	@Test
	void test() {
		Course kor = new Course("국어");
		//Course 클래스에 국어값을 집어넣고 Course형인 kor이라는 클래스를 만든다.
		Course math = new Course("수학");
		
		Student std1 = new Student(1, "홍길동");
		Student std2 = new Student(2, "이순신");
		
		//홍길동이 국어를 수강하여 10점을 받았어요
		std1.addTake(new Take(kor, 10)); 
		//take에 kor과 10을 입력하고 값이 입력된 take를 addTake함수를 통해 std1에 넣는다.
		//홍길동이 수학을 수강하여 20점을 받았어요
		std1.addTake(new Take(math, 20));
		
		//이순신이 국어를 수강하여 20점을 받았어요
		std2.addTake(new Take(kor, 20));
		//홍길동이 수학을 수강하여 30점을 받았어요
		std2.addTake(new Take(math, 30));
		
		//홍길동의 총점을 구하여 출력하고 싶은데 이는 30이라는 결과가 나와야한다.
		assertTrue(std1.getTakeTotal() == 30);
		
		//이순신의 총점을 구하여 출력하고 싶은데 이는 50이라는 결과가 나와야한다.
		assertTrue(std2.getTakeTotal() == 50);
		
		
		
		//take클래스에는 course가 포함되어있고, 그 take를 다시 student에 포함시키면
		//student정보 + course정보 + take정보가 모두 들어간다.
		
	}

}
