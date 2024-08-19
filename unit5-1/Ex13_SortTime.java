package ch05.unit01;

public class Ex13_SortTime {

	public static void main(String[] args) {
		int []a = new int[1000];
		int []b = new int[1000];
		int t, n;
		
		for(int i=0; i<a.length; i++) {
			n = (int)(Math.random()*1000)+1;
			a[i] = n;
			b[i] = n;
		}
		
		int pass = 1;
		boolean flag;
		
		long start = System.currentTimeMillis();
		do {
			flag = false;
			
			for(int i=0; i<a.length-pass; i++) {
				if(a[i]>a[i+1]) {
					t=a[i]; a[i]=a[i+1]; a[i+1] = t;
					flag = true;
				}
			}
			pass++;
		} while(flag);
		long end = System.currentTimeMillis();
		System.out.println("bubble 1 : " + (end-start) + "ms");
		
		flag = true;
		long start2 = System.currentTimeMillis();
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<b.length-i; j++) {
				if(b[j]>b[j+1]) {
					t=b[j]; b[j]=b[j+1]; b[j+1]=t;
					flag = true;
				}
			}
		}
		long end2 = System.currentTimeMillis();
		System.out.println("bubble 2 : " + (end2-start2) + "ms");
		
	}

}
