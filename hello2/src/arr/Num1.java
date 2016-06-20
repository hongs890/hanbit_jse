/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : Num1.java
 * @story : 1등을 출력하시오
 */
public class Num1 {
	/**
	 * 학생수는 입력받습니다.  
	 * 학생의 점수만 입력해서
	 * 최고점과 최저점만 출력하는
	 * 로직을 작성하시오.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int student=0, i=0, max=0, min=101;
		System.out.println("학생 수가 몇명입니까?");
		student = scanner.nextInt();
		
		
		int[]score = new int[student];
		System.out.println("점수를 입력하세요 : ");
		
		for (; i < score.length; i++) {
			score[i] = scanner.nextInt();	
					
			if (score[i] > max) {
				max = score[i];
						
			} else if (min > score[i]){
				min = score[i];
			}
		}	
		System.out.printf("최고점 : %d 최저점 : %d  ", max, min);
	}
}
