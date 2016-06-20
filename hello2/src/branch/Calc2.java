/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 8.
 * @author: 배근홍
 * @file  : Calc.java
 * @story :
 */
public class Calc2 {
	/*
	 * 두 개의 정수를 입력받아서
	 * opCode 값이 1이면 덧셈
	 * 2면 뺄셈
	 * 3이면 곱셈
	 * 4면 나눗셈(몫)
	 * 5면 나머지구하는 계산기
	 * 조건은 systemout은 1회만 사용.
	 * */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int one = 0, two = 0, result = 0, opCode = 0;
		String opCode2 = "";

		System.out.print("첫 번째 정수를 입력하세요");
		one = scanner.nextInt();

		System.out.print("opCode를 입력하세요 1은덧셈, 2는뺄셈, 3은곱셈, 4는나눗셈, 5는나머지");
		opCode = scanner.nextInt();

		System.out.print("두 번째 정수를 입력하세요");
		two = scanner.nextInt();

		switch (opCode) {
		case 1:
			result = one + two;
			opCode2 = "+";
			break;
		case 2:
			result = one - two;
			opCode2 = "-";
			break;
		case 3:
			result = one * two;
			opCode2 = "*";
			break;
		case 4:
			result = one / two;
			opCode2 = "/";
			break;
		case 5:
			result = one % two;
			opCode2 = "%";
			break;
		default:
			System.out.println("1~5까지만 입력 바랍니다");
			return;
		}	
		System.out.println(one + opCode2 + two + "=" + result);
	}
}
