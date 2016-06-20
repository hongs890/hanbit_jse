/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : ArrAssign.java
 * @story :
 */
public class ArrAssign2 {
	public static void main(String[] args) {
		/**
		 * 전교생이 몇명인지 몰라요.
		 * 전교생 수를 입력받고 
		 * 학생의 이름과 나이를
		 * 입력받고, 이것을 출력하세요
		 * */
		Scanner scanner = new Scanner(System.in);
		
		int i=0, num=0, student=0;
		System.out.println("학생 수가 몇명입니까?");
		student = scanner.nextInt();
		
		int[]age = new int [student];
		String[]name = new String[student];
		
		System.out.println("?명의 이름, 나이? : ");
		for (; i < name.length; i++) {
			name[i] = scanner.next();
			age[i] = scanner.nextInt();
		}
		System.out.print("====================\n");
		System.out.print("학번 | 이름 | 나이\n");
		System.out.print("====================\n");
		for (i=0; i < age.length; i++) {
			num +=1;
			System.out.printf("%d\t%s\t%d\n",num,name[i],age[i]);
		}
	}
}
