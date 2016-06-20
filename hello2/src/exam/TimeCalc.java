/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 10.
 * @author: 배근홍
 * @file  : TimeCalc.java
 * @story :	초를 가지고 시간, 분, 초로 환산하기
 */
public class TimeCalc {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000초로 나오네요.
	 * 그런데 이게 감이 잘 안와서요..
	 * 시간, 분, 초로 나누어서 보게 해주세요.
	 * 예를들면 50000초가 입력되면
	 * [출력]25시간 32분 15초 이렇게 보이게 해주세요.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("초를 입력하세요 : ");		
		int insert = scanner.nextInt();
		System.out.println(insert / 3600+"시간 "+(insert / 60) % 60+"분 "+insert%60+"초");
	}
}
