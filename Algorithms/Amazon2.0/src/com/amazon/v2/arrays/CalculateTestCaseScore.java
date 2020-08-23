package com.amazon.v2.arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CalculateTestCaseScore {
	public int solution(String[] R, String T[]) {

		List<TestCase> result = new ArrayList<TestCase>();
		for (int i = 0; i < T.length; i++) {
			String str1 = T[i];
			if (!Character.isDigit(str1.charAt(str1.length() - 1))) {
				result.add(new TestCase(str1.substring(0, str1.length() - 1), R[i]));
			} else
				result.add(new TestCase(T[i], R[i]));

		}

		Map<Object, List<TestCase>> finalResult = result.stream().collect(Collectors.groupingBy(t -> t.getTaskName()));

		Set it = finalResult.keySet();

		Iterator it1 = it.iterator();
		int passCount = 0;
		int task = 0;
		while (it1.hasNext()) {
			boolean flag = true;
			List<TestCase> temp = finalResult.get(it1.next());

			for (int i = 0; i < temp.size(); i++) {
				TestCase te = temp.get(i);
				if (!te.getTaskStatus().equalsIgnoreCase("OK")) {
					flag = false;
					break;
				}
			}
			if (flag) {
				passCount = passCount + 1;
			}
			task++;
		}
		return ((passCount * 100) / task);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateTestCaseScore t = new CalculateTestCaseScore();

		String T[] = { "T1", "T3", "T4a", "T2", "T4b", "T6", "T5a", "T7", "T5b" };
		String R[] = { "OK", "OK", "Wrong", "Wrong", "OK", "Wrong", "OK", "OK", "Wrong" };

		System.out.println(t.solution(R, T));

	}

}
