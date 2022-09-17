package kr.co.ezenac.array2;

public class TwoDArray2 {

	public static void main(String[] args) {
		int[][] score = new int[][] {
			{100, 70, 50},
			{70, 50, 30},
			{50, 80, 70},
			{55, 85, 77},
			{100, 80, 50}
		};
		
		int korTotal = 0;			//국어 총점
		int engTotal = 0;			//영어 총점
		int mathTotal = 0;			//수학 총점
		int totalSum = 0;			//개인별 총점의 합계
		double totalAvg = 0.0;		//개인별 평균의 평균
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;								//개인별 총점
			double avg = 0;								//개인별 평균
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(i + 1);					//번호 출력
//			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];						//개인별 총점
				System.out.printf("\t" + score[i][j]);	//국영수 출력
			}
			
			totalSum += sum;							//개인별총점의 합계
			
			avg = (double)sum/score[i].length; 			//개인별 평균
			totalAvg += avg;							//개인별 평균의 평균
			
			System.out.print("\t" + sum + "\t" + avg + "\n");
		}
		
		totalAvg /= score.length;						//개인별 평균의 평균
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f",
								korTotal, engTotal, mathTotal, totalSum, totalAvg);
		
	}

}
