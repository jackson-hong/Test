package august.tenth;

public class BestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String solution(int n) {
		String answer = "";
		int k = 0;

		while (n > 0) {
			System.out.print(n + ", ");
			k = n % 3; // 나머지 - 자릿수 (낮은자리부터)
			System.out.print(k + ", ");
			n = n / 3; // 몫 - 다음루프의 피제수
			System.out.print(n + ", ");
			if (k == 0) {
				n = n - 1; // 자리올림을 안 하는 효과
				k = 4;
			}
			answer = k + answer;
			System.out.print(answer + ", ");
			System.out.println();
		}
		return answer;
	}
}
