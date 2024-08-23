package ch07.unit04;

public class Ex09 {

	public static void main(String[] args) {
		String[] ss = new String[] {"서울","부산","대구","인천",
				"광주","대전","울산","세종"};
		
		System.out.print("source : ");
		disp(ss);
		
		// Arrays.sort(ss);
		bubbleSort(ss);
		
		System.out.print("sort : ");
		disp(ss);
		
	}
	
	public static void disp(String[] s) {
		for(String a : s) {
			System.out.print(a + " "); 
		}
		System.out.println();
	}

	public static void bubbleSort(String[] ss) {
		boolean flag = true;
		String t;
		
		for(int i=1; flag; i++) {
			flag = false;
			for(int j=0; j<ss.length-i; j++) {
				if(ss[j].compareTo(ss[j+1]) > 0) {
					t = ss[j]; ss[j] = ss[j+1]; ss[j+1] = t;
					flag = true;
				}
			}
		}
	}

}
