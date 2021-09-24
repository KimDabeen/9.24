package model;

import java.util.ArrayList;
import java.util.List;

/**
 *학생 
 * @author fanta
 *
 */

public class Student {
	private int id; //학번
	private String name; //이름
	private List<Take> takes; //수강과목별 점수. 수강 실적
	//Take가 담겨있는 takes라는 list를 만듦.
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		takes = new ArrayList<>(); //takes에 공간 만들기
		
	}
	/**
	 * 수강 내역을 학생에 담아 관리한다.
	 * @param take
	 */
	public void addTake(Take take) { //takes에 값을 추가하는 함수를 만들었다.
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
