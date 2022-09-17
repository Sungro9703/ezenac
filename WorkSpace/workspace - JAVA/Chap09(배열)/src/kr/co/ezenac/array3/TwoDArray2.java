package kr.co.ezenac.array3;

import java.util.Scanner;

/*
 *  반 수 입력: 3
 *  1반의 인원: 2
 *  1반의 1번의 점수: 90
 *  1반의 2번의 점수: 100
 *  
 *  2반의 인원: 3
 *  2반의 1번의 점수: 80
 *  2반의 2번의 점수: 89
 *  2반의 3번의 점수: 90
 *  
 *  3반의 인원: 2
 *  3반의 1번의 점수: 100
 *  3반의 2번의 점수: 80
 *  
 *  반		합계		평균
 *  --------------------
 *  1반		190		95.0
 *  2반		
 *  3반
 *  계
 */

public class TwoDArray2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] student;								//2차원 배열 선언
		//반 수, 각 반의 인원 수, 합계, 총합, 반 평균, 전체 평균
		int count = 0, num = 0, sum = 0, total = 0;
		double avg = 0.0, avgTotal = 0.0;
		
		System.out.print("반 수 입력: ");
		count = scan.nextInt();
		
		student = new int[count][];
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d반의 인원: ", i+1);
			num = scan.nextInt();						//반의 인원
			student[i] = new int[num];					//1차원 배열 생성
			for(int j=0; j<student[i].length; j++) {
				System.out.printf("%d반의 %d번의 점수: ", (i+1), (j+1));
				student[i][j] = scan.nextInt();			//실제 반 인원의 점수
			}
		}
		System.out.println("반\t합계\t평균");
		System.out.println("-----------------------");
		for(int i=0; i<student.length; i++) {
			sum = 0;									//반별 합계 초기화
			
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j];					//반별 합계
			}
			total += sum;								//반별 합계의 총합
			avg = (double)sum/student[i].length;		//반별 평균
			avgTotal += avg;
			
			System.out.printf("%d반\t%d\t%.1f\n", i+1, sum, avg);
		}
		
		avgTotal = avgTotal / student.length;			//반별 평균의 평균
		System.out.printf("계\t%d\t%.1f", total, avgTotal);
		
		
		scan.close();

	}

}
