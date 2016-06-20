/**
 * 
 */
package loop;

/**
 * @date  : 2016. 6. 14.
 * @author: 배근홍
 * @file  : ForLoopEx6.java
 * @story : init=0, limit=10, diff=2 인 reverse sequences 
 */
public class ForLoopEx6 {
	public static void main(String[] args) {
		int i=10;
		for (; i >= 0; i-=2) {
			System.out.printf("%d\t",i);
		}
	}
}
