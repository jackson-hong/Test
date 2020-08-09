package august.eighth;

import java.util.ArrayList;

// https://programmers.co.kr/learn/courses/30/lessons/42586
public class Main2 {
	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55, 98, 54, 93 };
		int[] speeds = { 1, 30, 5, 2, 6, 10 };
		int[] answer = solution(progresses, speeds);
		for (int i : answer) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			int temp = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
			newArr.add(temp);
		}
		for (int i = 0; i < newArr.size()-1; i++) {
			if (newArr.get(i) > newArr.get(i + 1)) {
				newArr.set(i+1, newArr.get(i));
			}
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(1);
		int newIndex = 0;
		for(int i = 0; i < newArr.size()-1; i++) {
			if(newArr.get(i) == newArr.get(i+1)) {
				result.set(newIndex, result.get(newIndex)+1);
			}else {
				result.add(1);
				newIndex++;
			}
		}
		answer = new int[result.size()];
		int index = 0;
		for (Integer i : result) {
			answer[index] = i;
			index++;
		}
		return answer;
	}
}
