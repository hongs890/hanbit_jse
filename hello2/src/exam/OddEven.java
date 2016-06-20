/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date  : 2016. 6. 10.
 * @author: 배근홍
 * @file  : OddEven.java
 * @story :
 */
public class OddEven {
	/**
	 * 개발자님, 홀짝 게임하나 만들어주세요.
	 * 사용자가 홀인지 짝인지 맞추면
	 * WIN 틀리면 LOSE가 출력되면 됩니다.  
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num=random.nextInt(10)+1, insert=0;
		String win="lose";
		System.out.println("개발자만 보이는 화면 "+num);
		System.out.println("홀이면 1, 짝이면0을 입력해주세요.");
		insert = scanner.nextInt();
		if (insert==num%2) {
			win = "win";
		}
		System.out.println(win);
	}
}
