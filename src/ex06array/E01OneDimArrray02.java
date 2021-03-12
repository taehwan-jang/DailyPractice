package ex06array;

import java.util.Random;

public class E01OneDimArrray02 {

	public static void main(String[] args) {

		double rndNumber = Math.random();
		System.out.println("난수[실수]:"+rndNumber);
		
		int rndNum = (int)(Math.random()*100);
		System.out.println("난수[정수]:"+rndNum);
		
		
		Random random = new Random();
		System.out.println("생성된 난수:"+ random.nextInt());
		System.out.println("====================");
		
		System.out.println("크기가 6인 배열에 난수 입력\n");
		int[] lottoNum = new int[6];
		for(int i=0 ; i<lottoNum.length ; i++) {
			lottoNum[i] = (int)((Math.random()*100%45)+1);
		}
		for(int i=0 ; i<lottoNum.length ; i++) {
			System.out.printf("로또번호:%-2d\n",lottoNum[i]);
		}
		
		
	}

}
