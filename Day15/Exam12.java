package pro01.sec1;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		//while, do~while
		//while: 조건이 만족하는 동안 반복 실행 -> while(조건) { 반복실행할문장; }
		int i=0;
		while (i<10) {
			i++;
			System.out.println(i+"번째");
		}
		
		//do~while: 우선 실행 후에 조건이 만족하면 계속 반복 실행. -> do { 실행문; } while(조건);
		//그러므로 최소 1회 이상 실행을 보장하므로 무조건 1번은 실행됨
		int k=0;
		do {
			k++;
			System.out.println("k:"+k);
		} while(k>=10);
		
		
		//while 무한 루프
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.print("입력[1-4]:");
			int sw = sc.nextInt();
			switch(sw) {
				case 1:
					System.out.println("김기태");
					break;
				case 2:
					System.out.println("곽현상");
					break;
				case 3:
					System.out.println("이형원");
					break;
				default:
					System.out.println("종료");
					loop = false;
			}
		}
		
	}

}
