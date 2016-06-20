/**
 * 
 */
package exam;

import java.util.Scanner;
/**
 * @date  : 2016. 6. 10.
 * @author: 배근홍
 * @file  : Gender.java
 * @story :
 */
public class Gender {
	
	/**
	 * 개발자님 저희 사이트는 주민번호 앞자리와 성별
	 * 판별번호만 입력합니다.
	 * 예를들어 800101-1 까지만 입력하면
	 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
	 * 자동으로 DB에 저장되는 시스템을 개발해주세요.
	 * [출력문] 홍길동(남)*/
	
	/*1,2 : 국내 1900년대생 남,녀
	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀*/	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "", gender = "", result = "여";

		System.out.print("이름을 입력해주세요 : ");
		name = scanner.next();
		System.out.print("주민등록 번호를 입력해주세요 : ");
		gender = scanner.next();

		char sevenNumber = gender.charAt(7);

		if (sevenNumber == '0' || sevenNumber == '9') {
			System.out.println("잘못된 값을 입력하셨습니다.");
			return;
		}
		if (sevenNumber % 2 == 1) {
			result = "남";
		}

		System.out.println(name + "(" + result + ")");

	}

}
