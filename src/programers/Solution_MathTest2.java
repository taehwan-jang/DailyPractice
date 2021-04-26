package programers;

import java.util.ArrayList;

public class Solution_MathTest2 {

/*
    시험은 최대 10,000 문제로 구성되어있습니다.
    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
    
    1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
*/
    public int[] solution(int[] answers) {
    	int[] a = {1, 2, 3, 4, 5};
    	int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	int a1=0;
    	int b1=0;
    	int c1=0;
    	int index=0;
    	int index1=0;
    	
    	for(int i=0;i<answers.length ;i++) {
    		if(a[i%5]==answers[i]) a1++;
    		if(b[i%8]==answers[i]) b1++;
    		if(c[i%10]==answers[i]) c1++;
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(a1);
    	list.add(b1);
    	list.add(c1);
    	int maxNum=0;
    	for(int i=0; i<3 ;i++) {
    		if(list.get(i)>=maxNum) 
    			maxNum=list.get(i);
    			list.add(null);
    	}
    	for(int i=0 ; i<list.size() ;i++) {
    		if(list.get(i)<maxNum)
    			list.remove(i);
    	}
    	int[] answer = new int[list.size()];
    	for(int t : list) {
    		answer[index++]=list.get(index1++);
    	}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
