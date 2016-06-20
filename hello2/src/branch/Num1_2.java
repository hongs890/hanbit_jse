/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 9.
 * @author: 배근홍
 * @file  : Num1.java
 * @story :
 */
public class Num1_2 {
	
	/**
	 * 저희 반은 학생수가 3명입니다.
	 * 학생의 평균 점수는 0~100점 사이입니다.
	 * 3명의 평균 점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * ex 홍길동 49, if문으로 해결. 
	 * =====
	 * 1등 김구 96점
	 * 2등 김유신 78점
	 * 3등 홍길동 49점
	 * =====*/
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String student1="", student2="", student3="", name1="", name2="", name3="";
		int ave1=0, ave2=0, ave3=0, result1=0, result2=0, result3=0;
		
		System.out.print("첫 번째 학생 이름을 입력하세요 : ");
		student1 = scanner.next();
		System.out.print("첫 번째 학생 점수를 입력하세요 : ");
		ave1 = scanner.nextInt();
		
		System.out.print("두 번째 학생 이름을 입력하세요 : ");
		student2 = scanner.next();
		System.out.print("두 번째 학생 점수를 입력하세요 : ");
		ave2 = scanner.nextInt();

		System.out.print("세 번째 학생 이름을 입력하세요 : ");
		student3 = scanner.next();
		System.out.print("세 번째 학생 점수를 입력하세요 : ");
		ave3 = scanner.nextInt();
	
		
		if (ave1 > ave2 && ave1 > ave3) {
			result1 = ave1;
			name1 = student1;
			if (ave2 > ave3) {
				result2 = ave2;
				name2 = student2;
				result3 = ave3;
				name3 = student3;
			} else {
				result2 = ave3;
				name2 = student3;
				result3 = ave2;
				name3 = student2;
			}
		} else if (ave2 > ave3) {
			result1 = ave2;
			name1 = student2;
			if (ave1 > ave3) {
				result2 = ave1;
				name2 = student1;
				result3 = ave3;
				name3 = student3;
			} else {
				result2 = ave3;
				name2 = student3;
				result3 = ave1;
				name3 = student1;
			}
		} else {
			result1 = ave3;
			name1 = student3;
			if (ave1 > ave2) {
				result2 = ave1;
				name2 = student1;
				result3 = ave2;
				name3 = student2;
			} else {
				result2 = ave2;
				name2 = student2;
				result3 = ave1;
				name3 = student1;
			}
		}
		System.out.println("1등:"+name1+result1+"점 2등:"+name2+result2+"점 3등:"+name3+result3+"점 입니다.");
	}
}
