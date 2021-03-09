package ex04controlstatment;

public class E01If03 {

	public static void main(String[] args) {

		int kor = 99, eng = 70, math = 64;
		int sum = (kor + eng + math);
		double avg = (kor + eng + math) / 3.0;
		
		System.out.printf(" 국어 : %d%n 영어 : %d%n 수학 : %d%n%n 총점 : %d%n 평균 : %.2f%n%n",
				kor,eng,math,sum,avg);
		
		if(avg >= 90) {
			System.out.println(" A학점");
		}
		else if(avg >= 80) {
			System.out.println(" B학점");
		}
		else if(avg >= 70) {
			System.out.println(" C학점");
		}
		else if(avg >= 60) {
			System.out.println(" D학점");
		}
		else {
			System.out.println(" F학점");
		}
		
		
	}

}
