package august.eighth;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2,1,3,2,3,4,5,1};
		System.out.println(solution(priorities, 2));
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;
        //{2, 1, 3, 2} = que
        //{3, 2, 2, 1} = priorities
        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                break;
            }else{
                que.add(i);
                l--;
                if(l<0)l=que.size()-1;
            }
        }

        return answer;
    }
}
