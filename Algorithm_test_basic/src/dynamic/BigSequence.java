package dynamic;

import java.util.Scanner;

public class BigSequence {

	public static void main(String[] args) {
		//#11055번 가장 큰 증가하는 수열
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max = 0;
		int a[] = new int[n+1];
		int d[] = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=1;i<=n;i++){
			d[i] = a[i];
			for(int j=1;j<i;j++) {
				if(a[j]<a[i] && d[i] < d[j]+a[i]) {
					d[i] = d[j] + a[i];
				}
			}
			
			if(max < d[i]) {
				max = d[i];
			}
		}
		
		System.out.println(max);
		sc.close();
	}

}
