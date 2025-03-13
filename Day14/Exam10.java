package pro01.sec1;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		//은행의 입출금시스템을 만들기(1. 입금, 2. 출금, 3. 계좌조회)
		//1. 입금 -> 입금할 금액: xxx 엔터 -> 잔액=잔액+입금액 
		//2. 출금 -> 출금할 금액: xxx 엔터 -> 잔액=잔액-출금액 
		//3. 계좌조회 -> 잔액 출력
		//잔액(balance), 금액(money)
		Scanner sc = new Scanner(System.in);
		int money=0;	//금액
		int balance=0;	//잔액
		System.out.print("1. 입금, 2. 출금, 3. 계좌조회 \n작업[1-3]: ");
		int job = sc.nextInt();
		switch (job) {
			case 1:
				Scanner sc1 = new Scanner(System.in);
				System.out.print("입금할 금액: ");
				money = sc1.nextInt();
				balance+=money;	//잔액=잔액+입금액
				break;
			case 2:
				Scanner sc2 = new Scanner(System.in);
				System.out.print("출금할 금액: ");
				money = sc2.nextInt();
				balance-=money;	//잔액=잔액-출금액
				break;
			case 3:
				System.out.println("잔액: "+balance);
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}

}
