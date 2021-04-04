package programers;
/*
카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 
세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 
다트 게임의 점수 계산 로직은 아래와 같다.

    다트 게임은 총 3번의 기회로 구성된다.
    각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
    점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시
     점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
    옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 
    바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
    스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
    스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 
    점수는 4배가 된다. (예제 4번 참고)
    스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 
    점수는 -2배가 된다. (예제 5번 참고)
    Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
    스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.

0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
 */
public class Solution_Dart {

    public static int solution(String dartResult) {
        int answer = 0;
        char[] strArr = dartResult.toCharArray();
        int[] arr = new int[3];
        int index = 0;
        boolean b = false;
        
        for(char a : strArr) {
        	System.out.print(a+" ");
        }
        System.out.println();
        //첫번째 숫자 판단 -> 10인지 아닌지
        if(strArr[0]=='1'&&strArr[1]=='0') {
        	arr[index]=10;
        }
        else {
        	arr[index]=strArr[0]-'0';	
        }
        for(int i=1; i<strArr.length ; i++) {
        	
        	System.out.println("디버그1:"+arr[index]);
        	if(strArr[i]=='S') {
        		arr[index]=(int)Math.pow(arr[index], 1);
        		b=true;
        	}
        	else if(strArr[i]=='D') {
        		arr[index]=(int)Math.pow(arr[index], 2);
        		b=true;
        	}
        	else if(strArr[i]=='T') {
        		arr[index]=(int)Math.pow(arr[index], 3);
	    		b=true;
	    	}
        	//첫번째에 나온 경우 먼저
        	System.out.println("디버그2:"+arr[index]);
        	if(strArr[i]=='*') {
        		if(index==0) {
        			arr[index]*=2;
        		}
        		else {
        			arr[index]*=2;
        			arr[index-1]*=2;
        		}
        	}
        	if(strArr[i]=='#') {
    			arr[index]*=(-1);
        	}
        	if(b) {
	        	if(strArr[i]>='0' && strArr[i]<='9') {
	        		if(strArr[i+1]=='0') {
	        			arr[++index]=10;
	        			b=false;
	        		}
	        		else {
	        			arr[++index]=strArr[i]-'0';
	        			b=false;
	        		}
	        		
	        	}
        	}
        	System.out.println("디버그3:"+arr[index]);
        }
        for(int a : arr) {
        	answer += a;
        }
        return answer;
    }// 미친문제였다.
	public static void main(String[] args) {
		
		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));

	}
}
