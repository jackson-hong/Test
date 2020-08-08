package august.eighth;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/42587

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2,1,3,2,3,4,5,1};
		System.out.println(solution(priorities, 2));
	}
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer> newPri = new ArrayList<Integer>();
        ArrayList<Integer> order = new ArrayList<Integer>();
        int j = 0;
        for(Integer i : priorities) {
        	newPri.add(i);
        	order.add(j);
        	j++;
        }
        int jindex = 0;
        for(int i = 0; i < newPri.size(); i++) {
        	if(newPri.get(jindex) < newPri.get(i)) {
        		int temp = newPri.get(jindex);
        		newPri.remove(jindex);
        		newPri.add(temp);
        		int tempOr = order.get(jindex);
        		order.remove(jindex);
        		order.add(tempOr);
        		i = jindex;
        	}
        	if(i == newPri.size()-1 && newPri.get(jindex) >= newPri.get(newPri.size()-1)) {
        		jindex++;
        		i=jindex;
        	}
        }
        for(answer = 0; answer < newPri.size(); answer++) {
        	if(order.get(answer) == location)break;
        }
        for(int i = 0; i < newPri.size(); i++) {
        	System.out.println(newPri.get(i) + " : " + order.get(i));
        }
        return answer+1;
    }
}
