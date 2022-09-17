package kr.co.ezenac;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] strArr = new String[5][5];

		boolean b = true;
		int count = 0;

		while (b) {
			System.out.println("1. 입력 2. 출력 3. 종료");
			System.out.print("> ");
			int in = scan.nextInt();
			switch (in) {
			case 1:
				// 입력
				if (count < 5) {
					String[] strInfo = new String[5];
					System.out.print("번호: ");
					int num = scan.nextInt();
					strInfo[0] = Integer.toString(num);

					System.out.print("이름: ");
					strInfo[1] = scan.next();

					for (int i = 2; i < 5; i++) {
						if (i == 2) {
							System.out.print("국어: ");
						} else if (i == 3) {
							System.out.print("영어: ");
						} else if (i == 4) {
							System.out.print("수학: ");
						}

						int score = scan.nextInt();

						if (score > 0 && score <= 100) {
							strInfo[i] = Integer.toString(score);
						} else {
							System.out.println("잘못 입력하셨습니다.");
							i--;
						}
					}

					strArr[Integer.parseInt(strInfo[0]) - 1] = strInfo;
					count++;
				} else {
					System.out.println("더이상 입력할 수 없습니다.");
				}
				break;
			case 2:
				System.out.println("-----------------------");
				for (int i = 0; i < strArr.length; i++) {
					if (strArr[i][0] != null) {
						System.out.printf("-----%d번 학생의 정보------\n", Integer.parseInt(strArr[i][0]));
						System.out.printf("번호: %03d  ", Integer.parseInt(strArr[i][0]));
						System.out.printf("이름: %s\n", strArr[i][1]);
						System.out.printf("국어: %03d  ", Integer.parseInt(strArr[i][2]));
						System.out.printf("영어: %03d  ", Integer.parseInt(strArr[i][3]));
						System.out.printf("수학: %03d\n", Integer.parseInt(strArr[i][4]));
						int sum = Integer.parseInt(strArr[i][2]) + Integer.parseInt(strArr[i][3])
								+ Integer.parseInt(strArr[i][4]);
						double avg = sum / 3;
						System.out.printf("총점: %03d  ", sum);
						System.out.printf("평균: %06.2f\n", avg);
					}

				}
				// 출력
				break;
			case 3:
				// 종료
				System.out.printf("이용해주셔서 감사합니다.");
				b = false;
				break;

			}
		}

	}

}
