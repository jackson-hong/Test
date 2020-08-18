package august.eighteenth;

public class Main {
	public static void main(String[] args) {

		String name = "JEROEN";
		System.out.println(solution(name));

	}

	// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	public static int solution(String name) {
		int answer = 0;

		String str = "";
		for (int i = 0; i < name.length(); i++) {
			str += "A";
		}

		int index = 0;
		while (true) {
			char c1 = name.charAt(index);
			char c2 = str.charAt(index);
			if (name.charAt(1) != 'A') {
				if (c1 == c2) {
					if (index == str.length() - 1) {
						System.out.println("여기 " + c2 + " " + c1 + " " + answer);
						index++;
					} else {
						System.out.println("여기 " + c2 + " " + c1 + " " + answer);
						answer++;
						index++;
					}
				} else {
					if (c1 <= 'N') {
						System.out.println("여기 " + c2 + " " + c1 + " " + answer);
						StringBuilder newStr = new StringBuilder(str);
						newStr.setCharAt(index, (char) (c2 + 1));
						str = newStr.toString();
						answer++;
					} else {
						if (c2 == 'A') {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							StringBuilder newStr = new StringBuilder(str);
							newStr.setCharAt(index, 'Z');
							str = newStr.toString();
							answer++;
						} else {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							StringBuilder newStr = new StringBuilder(str);
							newStr.setCharAt(index, (char) (c2 - 1));
							str = newStr.toString();
							answer++;
						}
					}
				}
				if (index == str.length())
					break;
			} else {
				if (index == 0) {
					if (c1 == c2) {
						if (index == str.length() - 1) {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							index++;
						} else {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							answer++;
							index++;
						}
					} else {
						if (c1 <= 'N') {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							StringBuilder newStr = new StringBuilder(str);
							newStr.setCharAt(index, (char) (c2 + 1));
							str = newStr.toString();
							answer++;
						} else {
							if (c2 == 'A') {
								System.out.println("여기 " + c2 + " " + c1 + " " + answer);
								StringBuilder newStr = new StringBuilder(str);
								newStr.setCharAt(index, 'Z');
								str = newStr.toString();
								answer++;
							} else {
								System.out.println("여기 " + c2 + " " + c1 + " " + answer);
								StringBuilder newStr = new StringBuilder(str);
								newStr.setCharAt(index, (char) (c2 - 1));
								str = newStr.toString();
								answer++;
							}
						}
					}
				}else {
					if(index == 1)index = str.length()-1;
					c1 = name.charAt(index);
					c2 = str.charAt(index);
					if (c1 == c2) {
						if(index == str.length()-1) {
							index--;
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
						}
						else {	System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							answer++;
							index--;
						}
					} else {
						if (c1 <= 'N') {
							System.out.println("여기 " + c2 + " " + c1 + " " + answer);
							StringBuilder newStr = new StringBuilder(str);
							newStr.setCharAt(index, (char) (c2 + 1));
							str = newStr.toString();
							answer++;
						} else {
							if (c2 == 'A') {
								System.out.println("여기 " + c2 + " " + c1 + " " + answer);
								StringBuilder newStr = new StringBuilder(str);
								newStr.setCharAt(index, 'Z');
								str = newStr.toString();
								answer++;
							} else {
								System.out.println("여기 " + c2 + " " + c1 + " " + answer);
								StringBuilder newStr = new StringBuilder(str);
								newStr.setCharAt(index, (char) (c2 - 1));
								str = newStr.toString();
								answer++;
							}
						}
					}
					if(index == 1)break;
				}
			}
		}
		System.out.println(str);
		return answer;
	}
}
