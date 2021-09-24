package model;

import java.util.ArrayList;
import java.util.List;

/**
 *�л� 
 * @author fanta
 *
 */

public class Student {
	private int id; //�й�
	private String name; //�̸�
	private List<Take> takes; //�������� ����. ���� ����
	//Take�� ����ִ� takes��� list�� ����.
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		takes = new ArrayList<>(); //takes�� ���� �����
		
	}
	/**
	 * ���� ������ �л��� ��� �����Ѵ�.
	 * @param take
	 */
	public void addTake(Take take) { //takes�� ���� �߰��ϴ� �Լ��� �������.
		takes.add(take);
	}
	public int getTakeTotal() {
		int sum = 0 ;
		for (Take take : takes) { 
			sum += take.getScore();
		}
		return sum;
	}
	
	
}
