package pro01.sec1;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		//switch(변수) { 
		//	case 기준값1:
		//		실행문1;
		//		break;
		//	case 기준값2:
		//		실행문2;
		//		break;
		//....
		//  default:
		//		실행문n;
		//}
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력[0-100]:");
		int data = sc.nextInt();
		int re = (int) data / 10;
		switch (re) {
			case 10:
				System.out.println("만점자");
				break;
			case 9:
				System.out.println("최우수");
				break;
			case 8:
				System.out.println("우수");
				break;
			case 7:
			case 6:
				System.out.println("보통");
				break;
			default:
				System.out.println("저조");
		}
		
		//은행의 입출금시스템을 만들기(1. 입금, 2. 출금, 3. 계좌조회)
		//1. 입금 -> 입금할 금액: xxx 엔터 -> 잔액=잔액+입금액 
		//2. 출금 -> 출금할 금액: xxx 엔터 -> 잔액=잔액-출금액 
		//3. 계좌조회 -> 잔액 출력
	}

}
