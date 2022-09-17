package kr.co.ezenac.grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		if(score >= 70 ) return "P";
			return "F";
		
		
		
	}

}
