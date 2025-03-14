package pro01.sec1;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		//은행의 입출금시스템을 만들기(1. 입금, 2. 출금, 3. 계좌조회)
		//1. 입금 -> 입금할 금액: xxx 엔터 -> 잔액=잔액+입금액 
		//2. 출금 -> 출금할 금액: xxx 엔터 -> 잔액=잔액-출금액 
		//3. 계좌조회 -> 잔액 출력
		//잔액(balance), 금액(money)을 활용하되 입금/출금/잔액조회가 무한루프 
		//while문으로 연동되어야함 
		boolean loop = true;	//무한반복조건
		int money=0;	//금액
		int balance=0;	//잔액
		while(loop) {
			Scanner sc = new Scanner(System.in);
			System.out.print("1. 입금, 2. 출금, 3. 잔액조회, 4. 종료 \n작업[1-4]: ");
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
					System.out.println("종료");
					loop = false;
			}
		}
		
	}

}
