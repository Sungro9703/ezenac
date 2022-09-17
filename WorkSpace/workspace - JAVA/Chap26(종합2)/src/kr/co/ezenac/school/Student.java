package kr.co.ezenac.school;

import java.util.ArrayList;

public class Student {
	
	private int studentId;			//학번
	private String studentName;		//이름
	private Subject majorSubject;	//전공(필수과목)
	private ArrayList<Score> scores = new ArrayList<>();		//성적리스트
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public ArrayList<Score> getScore() {
		return scores;
	}
	
	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
}
