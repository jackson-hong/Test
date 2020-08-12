package august.twelveth;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

//https://programmers.co.kr/learn/courses/30/lessons/49993

public class Main {
	public static void main(String[] args) {

		String[] arr = { "BACDE", "CBADF", "AECB", "BDA", "JPS", "CJDS", "ABCDEFG","CXF" };
		System.out.println("answer: " + solution("CBD", arr));

	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		Map<String, Integer> skillMap = new TreeMap<String, Integer>();
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		//skillmap에 옮기기
		for (int i = 0; i < skill.length(); i++) {
			skillMap.put("" + skill.charAt(i), i);
		}
		outerloop:
		for (int i = 0; i < skill_trees.length; i++) {
			boolean temp = false;
			//tree맵에 옮기기
			for (int j = 0; j < skill_trees[i].length(); j++) {
				treeMap.put("" + skill_trees[i].charAt(j), j);
				treeMap.keySet().retainAll(skillMap.keySet());
			}
			System.out.println(treeMap);
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<String> stringList = new ArrayList<String>();
			for (int j = 0; j < skill.length(); j++) {
				if (treeMap.containsKey("" + skill.charAt(j))) {
					list.add(treeMap.get("" + skill.charAt(j)));
					stringList.add(""+skill.charAt(j));
				}
			}
			System.out.print(list);
			System.out.println(stringList);
			if (!treeMap.containsKey("" + skill.charAt(0))) {
				for (int j = 1; j < skill.length(); j++) {
					if(treeMap.containsKey(""+skill.charAt(j))) {
						treeMap.clear();
						continue outerloop;
					}
				}
			} else {
				for (int j = 0; j < treeMap.size(); j++) {
					System.out.println("!!");
					if(!String.valueOf(skill.charAt(j)).equals(stringList.get(j))) {
						treeMap.clear();
						continue outerloop;
					} else if (list.size() == 1 && stringList.get(0).equals(""+skill.charAt(0))){
						answer++;
					}
				}
			}
			if (list.size() != 0) {
				for (int j = 0; j < list.size() - 1; j++) {
					if (list.get(j) > list.get(j + 1)) {
						break;
					}
					if (j == list.size() - 2) {
						answer++;
					}
				}
			} else if (list.size() == 1 && stringList.get(0).equals(""+skill.charAt(0))) {
				answer++;
			}
			else {
				answer++;
			}
			treeMap.clear();
		}
		return answer;
	}
}
