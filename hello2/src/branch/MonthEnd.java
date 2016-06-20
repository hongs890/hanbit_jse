/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 9.
 * @author: 배근홍
 * @file  : MonthEnd.java
 * @story :
 */
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는
	 * 프로그램.
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다 라고 뜬다. 
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int end=0;
		
		System.out.print("월을 입력하세요 : ");
		switch (scanner.nextInt()) {

		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			end = 31; break;
		case 4:case 6:case 9:case 11:
			end = 30; break;
		case 2:
			end = 29; break;
		default:
			System.out.println("1월에서 12월까지만 입력해주세요.");
			return;
		}
		
		System.out.println("마지막 날짜는 "+end+"일 입니다.");
		
	}
}
