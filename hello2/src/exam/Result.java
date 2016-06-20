/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author: 배근홍
 * @file : Result.java
 * @story :
 */
public class Result {
	public static void main(String[] args) {
		/*
		 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점,
		 * 평균***점] 을 출력하는 프로그램을 만들어 주세요. 단, 평균은 소수점이하는 절삭합니다.
		 */

		Scanner scanner = new Scanner(System.in);
		double kor = 0.0, eng = 0.0, math = 0.0;
		int sum = 0, aver = 0;
		System.out.println("이름 : ");
		String name = scanner.nextLine();

		System.out.println("국어 : ");
		kor = scanner.nextDouble();

		System.out.println("영어 : ");
		eng = scanner.nextDouble();

		System.out.println("수학 : ");
		math = scanner.nextDouble();

		sum = (int) (kor + eng + math);
		aver = (int) (sum / 3);

		System.out.println(name + " : 총점" + sum + "점, 평균" + aver + "점");

	}

}
