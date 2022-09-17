package kr.co.ezenac.array2;

public class TwoDArray {

	public static void main(String[] args) {
		// [][]대괄호의 개수 = n차원
		int[][] score = new int[][] {
			{100, 100, 100},
			{50, 50, 50},
			{10, 20, 30},
			{60, 20, 40}
									};
									
		// 2차원 배열의 값 읽고 쓰기 위해 더블루프가 필요
		for(int i=0; i<score.length; i++) {
			for(int j =0; j<score[i].length; j++) {
				System.out.println(score[i][j]);
			}
		}
		System.out.println("2차원의 배열의 주소: " + score);
		System.out.println("2차원 배열의 크기:" + score.length);
		
		for(int i=0; i<score.length; i++) {
			System.out.println("1차원 배열의 주소: " + score[i]);
			System.out.println("1차원 배열의 크기:" + score[i].length);
		}
		
		
	}

}
