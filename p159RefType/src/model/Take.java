package model;
/**
 * ����
 * @author fanta
 *
 */

public class Take {
	private Course course; //���� ������ ��������?
	private int score; //����
	
	public Take(Course course, int score) {
		super();
		this.course = course;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	
}
