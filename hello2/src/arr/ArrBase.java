/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : ArrBase.java
 * @story : 배열 (array)의 기초
 */
public class ArrBase {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		int i=0, rank=0;	
		int[]ave = new int[3];
		int[]result = new int[3];
		String[]student = new String[3];
		String[]name = new String[3];

		for (;i<ave.length;i++) {
			System.out.print("이름과 점수? : ");
			student[i]= scanner.next();
			ave[i]=scanner.nextInt();
		}
		
		if (ave[0] > ave[1] && ave[0] > ave[2]) {
			result[0] = ave[0];
			name[0] = student[0];
			if (ave[1] > ave[2]) {
				result[1] = ave[1];
				name[1] = student[1];
				result[2] = ave[2];
				name[2] = student[2];
			} else {
				result[1] = ave[2];
				name[1] = student[2];
				result[2] = ave[1];
				name[2] = student[1];
			}
		} else if (ave[1] > ave[2]) {
			result[0] = ave[1];
			name[0] = student[1];
			if (ave[0] > ave[2]) {
				result[1] = ave[0];
				name[1] = student[0];
				result[2] = ave[2];
				name[2] = student[2];
			} else {
				result[1] = ave[2];
				name[1] = student[2];
				result[2] = ave[0];
				name[2] = student[0];
			}
		} else {
			result[0] = ave[2];
			name[0] = student[2];
			if (ave[0] > ave[1]) {
				result[1] = ave[0];
				name[1] = student[0];
				result[2] = ave[1];
				name[2] = student[1];
			} else {
				result[1] = ave[1];
				name[1] = student[1];
				result[2] = ave[0];
				name[2] = student[0];
			}
		}
		
		
		for (i=0; i < ave.length; i++) {
			rank +=1;
			System.out.printf("%d등 : %s, %d \n",rank, name[i], result[i]);
		}
		
	}
}
