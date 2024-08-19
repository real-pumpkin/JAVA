package ch05.unit01;

public class Ex12_BubbleSort2 {

	public static void main(String[] args) {
		// 개선된 Bubble Sort
		
		int []a = new int[] {20,10,8,13,17,19,16,11,22,12};
		int t;
		
		System.out.print("source Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();

		/*
		int pass = 1;
		boolean flag = false;
		do {
			flag = false;
			for(int i=0; i<a.length - pass; i++) {
				if(a[i] > a[i+1]) {
					t = a[i]; a[i] = a[i+1]; a[i+1] = t;
					flag = true;
				}
			}
			// System.out.println(pass + "회전 : " + Arrays.toString(a));
			pass++;
		} while(flag);
		*/
		
		boolean flag = true;
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<a.length-i; j++) {
				if(a[j]>a[j+1]) {
					t = a[j]; a[j] = a[j+1]; a[j+1] = t;
					flag = true;
				}
			}
		}
		
		System.out.print("sort Data : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		
		
		
	}

}
