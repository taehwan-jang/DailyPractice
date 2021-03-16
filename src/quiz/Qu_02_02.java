package quiz;
/*

국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.

 */
public class Qu_02_02 {

	public static void main(String[] args) {
		
		int kor=99, eng=80, math=96;
		
		double avg1 = (kor+eng+math)/3.0;
		int avg2 = (int)avg1;
		
		System.out.printf("avg: %.2f",avg1);
		System.out.printf("\navg: %d",avg2);
	}
}
