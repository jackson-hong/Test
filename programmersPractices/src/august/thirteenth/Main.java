package august.thirteenth;

public class Main {
	public static void main(String[] args) {
		
		Main m = new Main();
		int[] a = {1,2,3,4,5,3,4,2,4,1,2,3,4,2,3,1,2,4,1};
		int[] b = {1,3,2,4,2,1,5,3,2,2,4,4,2,2,1,3,4};
		m.solution(a);
		m.solution(b);
		
	}
	
	public int[] solution(int[] answers) {
        int[] answer;
        
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == pattern1[i%5])a++;
        	
        	if(answers[i] == pattern2[i%8])b++;
        	
        	if(answers[i] == pattern3[i%10])c++;
        }
        System.out.println(""+a + " " + b + " " +c);
        
        if(a == b && b == c) {
        	answer = new int[] {1,2,3};
        }else {
        	if(a == b && b > c) {
        		answer = new int[] {1,2};
        	}else if (b == c && c > a) {
        		answer = new int[] {2,3};
        	}else if (a == c && c > b) {
        		answer = new int[] {1,3};
        	}else if (a > b && a > c) {
        		answer = new int[] {1};
        	}else if (b > a && b > c) {
        		answer = new int[] {2};
        	}else {
        		answer = new int[] {3};
        	}
        }
        return answer;
    }
}
