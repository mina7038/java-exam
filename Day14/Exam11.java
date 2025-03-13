package pro01.sec1;

public class Exam11 {

	public static void main(String[] args) {
		//첨자변수의 초기값으로 시작하여 조건이 만족하는 동안 증감식에 따라 증감을 하면서 반복할 문장 반복
		//for(첨자변수선언및초기화;조건식;증감식){ 반복할문장; }
		for(int i=1;i<=10;i++) { //반복구간=루프(Loop), 특정구간을 반복하는 작업=루핑 
			System.out.println(i+"번째");
		}
		//중첩for문
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
		//무한루프: 정지 없이 무한대로 루핑되는 반복 구조 for(;;) { }
		//break; 반복문 정지, switch 조건문에서 case 탈출 
		int k=0;
		for(;;) {
			k++;
			System.out.println(k+"번째로 널 싫어해~!");
			if(k>=10) break;
		}
		//continue: 특정 구간을 건너띄기
		for(int m=1;m<=50;m++) {
			if(m%5==0) continue;
			System.out.println(m);
		}
		//1~100 까지의 3의 배수이면서 5의 배수인 데이터의 합계를 출력
		int tot=0;
		for(int n=1;n<=100;n++) {
			if(n%3==0 && n%5==0) {
				tot+=n;
			}
		}
		System.out.println("1~100 -> 3과 5의 배수 합계:"+tot);
		
		//역for문
		for(int p=20;p>0;p--) {
			System.out.println(p+"번째");
		}
	}

}
