package user;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 8.
 * @author: 배근홍
 * @file  : Hello.java
 * @story : 메인 메소드 만드는 단축키
 */
public class Hello {
	// 메인 메소드 만드는 단축키
	// main + 컨트롤 + 스페이스
	public static void main(String[] args) {
		// 콘솔 출력 단축키
		// syso + 컨트롤 + 스페이스
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : [  ]");
		System.out.println("이름을 입력하세요 : " + scanner.next());
		System.out.println("생년월일을 입력하세요 : [  ]");
		System.out.println("생년월일을 입력하세요 :" + scanner.next());
		System.out.println("거주지를 입력하세요 : [  ]");
		System.out.println("거주지를 입력하세요 :" + scanner.next());

	}

}
