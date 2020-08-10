package august.tenth;

public class Main {
	public static void main(String[] args) {

		System.out.println(solution(14));

	}

	public static String solution(int n) {
		String answer = "";
		int times = 0;
		while (true) {
			if (n <= comparator(times) && n > comparator(times - 1)) {
				break;
			} else if (n <= comparator(times)) {
				break;
			} else {
				times++;
			}
		}
		int newN = n - comparator(times - 1);
		for (int i = 1; i <= times; i++) {
			System.out.println(i + " : " + newN + " : " + (int) Math.ceil((newN / Math.pow(3, times - i))));
			if (times - i != 0) {
				if ((int) Math.ceil((newN / Math.pow(3, times - i))) == 1) {
					answer += "1";
				} else if ((int) Math.ceil((newN / Math.pow(3, times - i))) == 2) {
					answer += "2";
					newN = newN - (int) Math.pow(3, times - i);
				} else if ((int) Math.ceil((newN / Math.pow(3, times - i))) == 3) {
					answer += "4";
					newN = newN - (int) Math.pow(3, times - i) * 2;
				}
			} else {
				if (n % 3 == 1)
					answer += "1";
				if (n % 3 == 2)
					answer += "2";
				if (n % 3 == 0)
					answer += "4";
			}
			System.out.println(answer);
		}
		return answer;
	}

	public static int comparator(int num) {

		int result = 0;

		for (int i = 1; i <= num; i++) {
			result += (int) Math.pow(3, i);
		}

		return result;
	}
}
