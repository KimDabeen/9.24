package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import model.Course;
import model.Student;
import model.Take;

class Test�л���� {

	@Test
	void test() {
		Course kor = new Course("����");
		//Course Ŭ������ ����� ����ְ� Course���� kor�̶�� Ŭ������ �����.
		Course math = new Course("����");
		
		Student std1 = new Student(1, "ȫ�浿");
		Student std2 = new Student(2, "�̼���");
		
		//ȫ�浿�� ��� �����Ͽ� 10���� �޾Ҿ��
		std1.addTake(new Take(kor, 10)); 
		//take�� kor�� 10�� �Է��ϰ� ���� �Էµ� take�� addTake�Լ��� ���� std1�� �ִ´�.
		//ȫ�浿�� ������ �����Ͽ� 20���� �޾Ҿ��
		std1.addTake(new Take(math, 20));
		
		//�̼����� ��� �����Ͽ� 20���� �޾Ҿ��
		std2.addTake(new Take(kor, 20));
		//ȫ�浿�� ������ �����Ͽ� 30���� �޾Ҿ��
		std2.addTake(new Take(math, 30));
		
		//ȫ�浿�� ������ ���Ͽ� ����ϰ� ������ �̴� 30�̶�� ����� ���;��Ѵ�.
		assertTrue(std1.getTakeTotal() == 30);
		
		//�̼����� ������ ���Ͽ� ����ϰ� ������ �̴� 50�̶�� ����� ���;��Ѵ�.
		assertTrue(std2.getTakeTotal() == 50);
		
		
		
		//takeŬ�������� course�� ���ԵǾ��ְ�, �� take�� �ٽ� student�� ���Խ�Ű��
		//student���� + course���� + take������ ��� ����.
		
	}

}
