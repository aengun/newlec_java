package chapter7ex5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

//		// 성적
//		int kor;
//		int eng;
//		int math;

		// exam객체를 생성
		Exam exam = new Exam();

		// 성적 입력
//		exam.input();
		Scanner scan = new Scanner(System.in);
		System.out.print("kor : ");
		exam.setKor(scan.nextInt());
		System.out.print("eng : ");
		exam.setEng(scan.nextInt());
		System.out.print("math : ");
		exam.setMath(scan.nextInt());
		
		// 총점 계산
		int total = exam.total();
		float avg = exam.avg();

		System.out.printf("kor : %d, eng : %d, math : %d, total : %d, avg : %f\n", exam.getKor(), exam.getEng(),
				exam.getMath(), total, avg);

	}

}
