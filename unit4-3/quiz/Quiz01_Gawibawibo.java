package ch04.unit03.quiz;

import java.util.Scanner;

/*
	가위 바위 보 게임 프로그램
*/
public class Quiz01_Gawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user, com;

		while (true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.게임종료 => ");
				user = sc.nextInt();
			} while (user < 1 || user > 4);

			if (user == 4) {
				break;
			}

			com = (int) (Math.random() * 3) + 1; // 1~3난수 발생
			System.out.println("유저 : " + (user == 1 ? "가위" : user == 2 ? "바위" : "보"));
			System.out.println("컴퓨터 : " + (com == 1 ? "가위" : com == 2 ? "바위" : "보"));

			if (user == com) {
				System.out.println("비겼습니다.\n");
			} else if (user-com == -2 || user-com == 1) {
				// (user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)
				System.out.println("유저가 이겼습니다.\n");
			} else {
				// user-com == 2 || user-com == -1
				System.out.println("컴퓨터가 이겼습니다.\n");
			}
		}

		sc.close();
	}
}
