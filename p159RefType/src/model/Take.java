package model;
/**
 * 수강
 * @author fanta
 *
 */

public class Take {
	private Course course; //무슨 과목을 수강했지?
	private int score; //점수
	
	public Take(Course course, int score) {
		super();
		this.course = course;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	
}
