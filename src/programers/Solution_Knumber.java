package programers;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_Knumber {

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array,commands);
	}

	public static int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int[] answer = new int[commands.length];
		int index = 0;
		for(int i = 0 ; i<commands.length ; i++) {
			temp.clear();
			for(int j = commands[i][0]-1 ; j<commands[i][1] ; j++) {
				temp.add(array[j]);
			}
			Collections.sort(temp);
			answer[index++]=temp.get(commands[i][2]-1);
		}
		return answer;
	}
}
