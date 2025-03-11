package pro01.sec1;

import java.util.Scanner;

public class Exam07 {  //pro01.sec1.Exam07

	public static void main(String[] args) {
		//키보드 입력 : 자동 임포트(Ctrl+Shift+O)
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("이름: ");
		String tmp = sc.nextLine();
		String name = sc.nextLine();
		System.out.println("당신의 이름은 "+name+"이며, "
				+ "나이는 "+age+"세 입니다.");
		//Scanner 클래스의 키보드 입력 제공 메서드
		//nextInt(), nextFloat(), nextLong(), nextShort(),
		//nextDouble(), next(), nextLine()
	}
}
