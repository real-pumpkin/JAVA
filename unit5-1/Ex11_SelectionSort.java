package ch05.unit01;

public class Ex11_SelectionSort {

	public static void main(String[] args) {
		// Selection Sort
		int []a = new int[] {20,10,8,13,17,19,16,11,22,12};
		int t;
		
		System.out.print("source Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 10개 : 9회전
		// 1회전 : (1번째:2), (1번째:3), ... (1번째:10)
		//        (0:1), (0,2), ... (0:9)
		// 2회전 : (2번째:3), (2번째:4) ... (2번째:10)
		//        (1,2), (1,3), ... (1:9)
		
		for(int i=0; i<a.length-1; i++) { // i=0 ~ 8, 회전
			for(int j=i+1; j<a.length; j++) { // j=i+1~9
				if(a[i] > a[j]) {
					t=a[i]; a[i]=a[j]; a[j]=t;
				}
			}
		}
		
		System.out.print("Sort Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();		

	}

}
