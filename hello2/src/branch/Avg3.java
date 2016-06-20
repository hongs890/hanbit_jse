package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author: 배근홍
 * @file : Avg.java
 * @story :
 */
public class Avg3 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 국,영,수 세과목점수를 입력받아서 [홍길동 : 총점 ***점, 평균***점, 학점 : F] 을 
	 * 출력하는 프로그램을 만들어 주세요. 
	 * 단, 평균은 소수점이하는 절삭합니다. 
	 * 평균점수가 90점 이상이면 A, 80이상이면 B, 70 이상이면 C
	 * 60점 이상이면 D, 50점 이상이면 E, 50점 미만이면 F 학점입니다 라고 출력되게 해주세요.
	 * [단] switch-case 문으로 해결하세요.
	 */
	public static void main(String[] args) {
		//---------------------- 변수 선언부, 준비, 초기화(init) ------
		Scanner scanner = new Scanner(System.in);
		double kor = 0.0, eng = 0.0, math = 0.0;
		int sum = 0, aver = 0, result = 0;
		String pass = "";
		// -------------------------- 연산부 (알고리즘)------------------------------
		System.out.print("이름 : ");
		String name = scanner.nextLine();
				
		System.out.print("순서대로 입력해주세요 [국어 :  영어 :  수학 : ]");
		kor = scanner.nextDouble();
		eng = scanner.nextDouble();
		math = scanner.nextDouble();
		if (kor >= 100 || eng >= 100 || math >= 100 || kor < 0 || eng < 0 || math < 0) {
			System.out.println("점수는 0~100점까지 입력해주세요");
			return;
		}		
				
		sum = (int) (kor + eng + math);
		aver = (int) (sum / 3);

		switch (aver/10) {
		case 9:
			pass = "A";
			break;
		case 8:
			pass = "B";
			break;
		case 7:
			pass = "C";
			break;
		case 6:
			pass = "D";
			break;
		case 5:
			pass = "E";
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
		// ----------------------------출력-------------------------
		System.out.println(name + " : 총점" + sum + "점, 평균" + aver + "점 학점 :"+pass+" 입니다");
	}
}
