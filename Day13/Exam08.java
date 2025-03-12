package pro01.sec1;

public class Exam08 {

	public static void main(String[] args) {
		//조건문: if문, if~else문, if~else if~else문, switch문
		int kor = 90, eng = 70, mat = 100;
		int tot = kor + eng + mat;
		float avg = tot / 3.0f;
		String pan = "탈락";
		//if (조건) {
		//	조건만족시실행문;
		//}
		//판정(pan)은 평균이 60점 이상이고, 
		//각 과목이 50점 이상이면 "합격" 아니면 "탈락"
		if(avg>=60 && kor>=50 && eng>=50 && mat>=50) {
			pan = "합격";
		} 
		System.out.println("당신은 최종 면접에 "+pan+"하셨습니다.");
		
		//if(조건) { 조건만족시실행; } else { 조건불만족시실행; }
		//비고는 한 과목이라도 100점이 있으면, "과목 우수" 아니면 "관계 없음"
		String remark="";
		if(kor==100 || eng==100 || mat==100) {
			remark = "과목 우수";
		} else {
			remark = "관계 없음";
		}
		System.out.println("비고: "+remark);
		
		//if(조건1) { 조건1만족시실행; } else if(조건2) { 조건2만족시실행; }
		//.....else if(조건n) { 조건n만족시실행; } else { 모든조건불만족시; }
		//학점은 평균이 90이상이면 "A", 80~89이면 "B", 70~79이면 "C",
		//60~69이면 "D", 60미만이면 "F"
		String hak="";
		if(avg>=90) { hak = "A"; } 
		else if(avg>=80) { hak = "B"; }
		else if(avg>=70) { hak = "C"; } 
		else if(avg>=60) { hak = "D"; } 
		else { hak = "F"; }
		System.out.println("학점: "+hak);
		
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
	}

}
