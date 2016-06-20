package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author: 배근홍
 * @file : Avg.java
 * @story :
 */
public class Avg {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점, 평균***점,
	 * 합격여부(불합격)] 을 출력하는 프로그램을 만들어 주세요. 단, 평균은 소수점이하는 절삭합니다. 평균점수가 60점 미만이면 불합격,
	 * 이상이면 합격입니다.
	 */
	public static void main(String[] args) {
		//---------------------- 변수 선언부, 준비, 초기화(init) ------
		Scanner scanner = new Scanner(System.in);
		double kor = 0.0, eng = 0.0, math = 0.0;
		int sum = 0, aver = 0, result = 0;
		String pass = "";
		// -------------------------- 연산부 (알고리즘)------------------------------
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

		if (aver > 60) {

			pass = "합격";

		} else {

			pass = "불합격";
		}
		// ----------------------------출력-------------------------
		System.out.println(name + " : 총점" + sum + "점, 평균" + aver + "점 합격여부[" + pass + "]입니다");
	}
}
