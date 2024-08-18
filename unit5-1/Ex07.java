package ch05.unit01;

public class Ex07 {

	public static void main(String[] args) {
		// 1~10까지 난수를 100개를 발생하여 한줄에 10개씩 출력하고
		// 마지막에 1~10까지 수가 각각 몇번씩 나왔는지 출력

		int[] a = new int[10];
		int n;

		for (int i = 1; i <= 100; i++) {
			n = (int) (Math.random() * 10) + 1;
			System.out.printf("%5d", n);
			if (i % 10 == 0) {
				System.out.println();
			}

			a[n - 1]++;
		}

		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + " : " + a[i]);
		}

	}

}
