package programers;

import java.util.ArrayList;

public class Solution_MathTest {

/*
    시험은 최대 10,000 문제로 구성되어있습니다.
    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
*/
    public int[] solution(int[] answers) {
    	
    	boolean[] a = new boolean[answers.length];
    	boolean[] b = new boolean[answers.length];
    	boolean[] c = new boolean[answers.length];
    	/*
    	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
    	 */
    	for(int i=0 ; i<answers.length ; i++) {
    		if((i+1)%6==1) {
    			a[i]=(answers[i]==1)?true:false;
    		}
    		else if((i+1)%6==2) {
    			a[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%6==3) {
    			a[i]=(answers[i]==3)?true:false;
    		}
    		else if((i+1)%6==4) {
    			a[i]=(answers[i]==4)?true:false;
    		}
    		else if((i+1)%6==5) {
    			a[i]=(answers[i]==5)?true:false;
    		}
    		if((i+1)%9==1) {
    			b[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%9==2) {
    			b[i]=(answers[i]==1)?true:false;
    		}
    		else if((i+1)%9==3) {
    			b[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%9==4) {
    			b[i]=(answers[i]==3)?true:false;
    		}
    		else if((i+1)%9==5) {
    			b[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%9==6) {
    			b[i]=(answers[i]==4)?true:false;
    		}
    		else if((i+1)%9==7) {
    			b[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%9==8) {
    			b[i]=(answers[i]==5)?true:false;
    		}
    		if((i+1)%11==1) {
    			c[i]=(answers[i]==3)?true:false;
    		}
    		else if((i+1)%11==2) {
    			c[i]=(answers[i]==3)?true:false;
    		}
    		else if((i+1)%11==3) {
    			c[i]=(answers[i]==1)?true:false;
    		}
    		else if((i+1)%11==4) {
    			c[i]=(answers[i]==1)?true:false;
    		}
    		else if((i+1)%11==5) {
    			c[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%11==6) {
    			c[i]=(answers[i]==2)?true:false;
    		}
    		else if((i+1)%11==7) {
    			c[i]=(answers[i]==4)?true:false;
    		}
    		else if((i+1)%11==8) {
    			b[i]=(answers[i]==5)?true:false;
    			c[i]=(answers[i]==4)?true:false;
    		}
    		else if((i+1)%11==9) {
    			c[i]=(answers[i]==5)?true:false;
    		}
    		else if((i+1)%11==10) {
    			c[i]=(answers[i]==5)?true:false;
    		}
    	}
    	int a1=0;
    	int b1=0;
    	int c1=0;
    	int index=0;
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<answers.length ;i++) {
    		if(a[i]) a1++;
    		if(b[i]) b1++;
    		if(c[i]) c1++;
    	}
    	if(a1>b1) {
    		if(a1>c1) {
    			list.add(1);
    		}
    		else if(a1==c1) {
    			list.add(1);
    			list.add(3);
    		}
    	}
    	else if(b1>c1) {
    		if(b1>a1) {
    			list.add(2);
    		}
    		else if(b1==a1) {
    			list.add(1);
    			list.add(2);
    		}
    	}
    	else if(c1>a1) {
    		if(c1>b1) {
    			list.add(3);
    		}
    		else if(c1==b1) {
    			list.add(2);
    			list.add(3);
    		}
    	}
    	else if(a1==b1) {
    		if(b1==c1) {
    			list.add(1);
    			list.add(2);
    			list.add(3);
    		}
    	}
    	int[] answer = new int[list.size()];
    	for(int t : list) {
    		answer[index++]=list.get(index++);
    	}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
