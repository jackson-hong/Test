package august.twelveth;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

//https://programmers.co.kr/learn/courses/30/lessons/49993

public class Main {
	public static void main(String[] args) {

		String[] arr = { "BACDE", "CBADF", "AECB", "BDA", "JPS", "CJDS" };
		System.out.println("answer: " + solution("CBD", arr));

	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		Map<String, Integer> skillMap = new TreeMap<String, Integer>();
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();

		for (int i = 0; i < skill.length(); i++) {
			skillMap.put("" + skill.charAt(i), i);
		}
		outerloop:
		for (int i = 0; i < skill_trees.length; i++) {
			boolean temp = false;
			for (int j = 0; j < skill_trees[i].length(); j++) {
				treeMap.put("" + skill_trees[i].charAt(j), j);
				treeMap.keySet().retainAll(skillMap.keySet());
			}
			System.out.println(treeMap);
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < skill.length(); j++) {
				if (treeMap.containsKey("" + skill.charAt(j))) {
					list.add(treeMap.get("" + skill.charAt(j)));
				}
			}
			System.out.println(list);
			if (!treeMap.containsKey("" + skill.charAt(0))) {
				for (int j = 0; j < skill.length(); j++) {
					if(treeMap.containsKey(""+skill.charAt(j))) {
						treeMap.clear();
						continue outerloop;
					}
				}
			}
			if (list.size() != 0) {
				for (int j = 0; j < list.size() - 1; j++) {
					if (list.get(j) > list.get(j + 1)) {
						break;
					}
					if (j == list.size() - 2) {
						temp = true;
					}
				}
			} else {
				temp = true;
			}
			treeMap.clear();
			if (temp)
			answer++;
		}
		return answer;
	}
}
