package kr.co.ezenac.school.view;

import java.util.ArrayList;

import kr.co.ezenac.grade.BasicEvaluation;
import kr.co.ezenac.grade.GradeEvaluation;
import kr.co.ezenac.grade.MajorEvaluation;
import kr.co.ezenac.grade.PassFailEvaluation;
import kr.co.ezenac.school.School;
import kr.co.ezenac.school.Score;
import kr.co.ezenac.school.Student;
import kr.co.ezenac.school.Subject;
import kr.co.ezenac.utils.Constant;

/*
 * 	필수과목인지 일반과목인지에 따라 각 정책 클래스가 학점을 평가할 수 있도록 구현
 * 
 * 	StringBuffer 클래스 이용 모든 학점리포트 내용을 만들고 난 후 String 클래스로 반환
 */
public class GradeReport {

	School school = School.getInstance();
	
	public static final String TITLE = "강의신청자 학점 >> \t\t\n";
	public static final String HEADER = "이름 \t | 학점 | 중점과목 \t | 점수 \n";
	public static final String LINE = "-------------------------------------\n";
	public static final String LINE2 = "====================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjects = school.getSubjects();
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}

	public void makeFooter() {
		buffer.append("\n");
		
	}

	public void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append(" | ");
			getScoreGrade(student, subject);		//학생별 해당과목별 점수, 학점계산
			buffer.append("\n");
			buffer.append(LINE);
			
		}
		
	}

	public void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scores = student.getScore();
		int majorId = student.getMajorSubject().getSubjectId();
		
		// 학점 평가 클래스들
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
		
		//학생이 가진 점수들
		for(int i=0; i<scores.size(); i++) {
			Score score = scores.get(i);
			if(score.getSubject().getSubjectId() == subject.getSubjectId()) {	//현재 학점을 산출할 과목
				String grade;
				
				if(score.getSubject().getGradeType() == Constant.PF_TYPE) {
					grade = gradeEvaluation[Constant.PF_TYPE].getGrade(score.getScore());
				}
				else {
					if(score.getSubject().getSubjectId() == majorId)			// 중점 과목인 경우
						grade = gradeEvaluation[Constant.SAB_TYPE].getGrade(score.getScore());
					else													// 일반과목
						grade = gradeEvaluation[Constant.AB_TYPE].getGrade(score.getScore());
				}
				
				buffer.append(score.getScore());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
				
			}	
		}
		
	}

	public void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GradeReport.TITLE);		
		buffer.append(GradeReport.HEADER);		
		buffer.append(GradeReport.LINE2);		
	}
	
	
	
	
}
