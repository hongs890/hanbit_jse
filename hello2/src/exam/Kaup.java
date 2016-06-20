/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 10.
 * @author: 배근홍
 * @file  : Kaup.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup {
	
	/**
	 * 개발자님 프로그램 제작의뢰입니다
	 * 비만지수를 구하는 것인데요
	 * 키와 몸무게를 입력하면 당사자가
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어 주세요.
	 * 돈은 입금 했습니다.
	 * 잘은 모르겠는데 kaup 공식을 쓰면 된다고 하네요.
	 * 공식은 나도 몰라요 알아서 하삼.
	 * */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height=0, weight=0, kaup=0;
		String name="", result="";
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.print("키를 입력해주세요 :");
		height = scanner.nextDouble();
		System.out.print("몸무게를 입력해주세요 : ");
		weight = scanner.nextDouble();
		
		kaup = weight / (height/100)/(height/100);
		
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
		} if (kaup >= 40) {
			result = "비만 3단계";
		}
		System.out.println(name+"님은 "+result+", BMI 수치는 "+kaup+"입니다.");
	}
}
