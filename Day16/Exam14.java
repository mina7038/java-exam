package pro01.sec1;

class Score {
	int kor;
	int eng;
	int mat;
	public Score() { }
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
}

public class Exam14 {
	public static void main(String[] args) {
		//개선된 for문
		int[] arr1 = {90, 60, 100, 80, 70};	//배열
		//int tot = arr1[0]+arr1[1]+arr1[2]+arr1[3]+arr1[4];
		int tot = 0;
		for(int a:arr1) {
			System.out.println(a);
			tot+=a;		//tot=tot+a
		}
		System.out.println("총점:"+tot);
		System.out.println("arr1:"+arr1);
		/*
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			tot+=arr1[i];
		} */
		Score sc1 = new Score(100, 80, 100);	//객체
		Score[] s = new Score[4];	//s[0]~s[3] 객체 배열
		s[0] = new Score(90, 100, 80);
		s[1] = new Score(100, 90, 70);
		s[2] = new Score(60, 40, 90);
		s[3] = new Score(100, 70, 80);
		for(Score dt:s) {
			System.out.println("국어:"+dt.kor);
			System.out.println("영어:"+dt.eng);
			System.out.println("수학:"+dt.mat);
			System.out.println();
		}
		Score[][] sarr = new Score[3][4];	//2차원 배열(3x4) 선언
		Score[][][] sarr3 = new Score[3][4][5];	//3차원 배열(3x4x5) 선언
		//가변배열
		Score[][] sco = new Score[3][];
		sco[0] = new Score[2];	//0번째줄의 요소는 2개
		sco[1] = new Score[4];	//1번째줄의 요소는 4개
		sco[2] = new Score[1];	//2번째줄의 요소는 1개
		
		int[][] jum = {
			{20, 10},
			{40, 50, 30, 10},
			{30}
		};
	}
}
