/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author: 배근홍
 * @file : Kaup2.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	/**
	 * 개발자님 BMI 지수가 너무 길게 나와요
	 */

	public static void main(String[] args) {

		// ----init
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double height = 0.0, weight = 0.0, kaup = 0.0;

		// ----op
		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.println("키를 입력하세요 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		weight = scanner.nextDouble();

		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (kaup >= 18.5 && kaup < 23) {
			result = "정상체중";
		} else if (kaup >= 23 && kaup < 25) {
			result = "위험체중";
		} else if (kaup >= 25 && kaup < 30) {
			result = "비만 1단계";
		} else if (kaup >= 30 && kaup < 40) {
			result = "비만 2단계";
		}
		if (kaup >= 40) {
			result = "비만 3단계";
		}

		System.out.printf("%s %s %.2f %s %s %s",name,"은 BMI지수는 ",kaup,"이고,",result,"이다.");
		// 위 문장을 printf 로 변경하시오 
		
		
	}

}
