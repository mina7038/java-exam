package pro01.sec1;
//형 변환(Type Casting)
public class Exam03 {
	public static void main(String[] args) {
		
		int kor = 90, eng = 80, mat = 90;
		int tot = kor + eng + mat;
		float avg = tot / 3;	// 자동 형 변환(Auto Casting) => Type coercion
		float pyn = tot / 3.0f;	// 강제 형 변환(Force Casting) => Explicit Conversion
		float mean = (float) tot / 3; //형 변환 연산자 활용된 강제 형 변환
		System.out.println("총점: "+tot);
		System.out.println("평균1: "+avg);	
		System.out.println("평균2: "+pyn);
		System.out.println("평균3: "+mean);
		
		int su1 = 32769;	//int=4Byte
		int su2 = su1;	//값 전달(주소 동일)
		short su3 = 64;  //short=2Byte 이므로 short su3 = su1 (X)
		short su4 = (short) su1;
		System.out.println("su1: "+su1);
		System.out.println("su4: "+su4);
		su1 = su3;	//int su1(4Byte) = short su3(2Byte) (O)
		//크기가 큰 변수(기억장소)의 데이터는 작은 변수(기억장소)에 저장하지 않는다.(X) 
		
		int py1 = (int) mean;
		String data = mean + "";
		int py = Integer.parseInt(data);
		System.out.println(py);
	}
}
