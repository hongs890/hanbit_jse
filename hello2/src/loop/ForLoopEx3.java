/**
 * 
 */
package loop;

/**
 * @date  : 2016. 6. 13.
 * @author: 배근홍
 * @file  : ForLoopEx.java
 * @story : 1부터 10까지 짝수와 홀수의 급수는? (단, 공차는 1)
 */
public class ForLoopEx3 {
	public static void main(String[] args) {
		
		int i = 0, oddsum=0, evensum=0;
		for (i = 1; i <= 10; i++) {
			
			if (i%2==0) {
				
				evensum +=i; 
				
			} else {

				oddsum +=i;
			}
		}
		System.out.printf("홀수는%d짝수는%d",evensum,oddsum);
	}
}
