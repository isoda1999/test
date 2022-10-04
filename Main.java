package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> valuList = new ArrayList<>();
		for(Integer i = 1; i < 11; i++) {
			valuList.add(i * 10);
		}
		System.out.println(valuList);
		long total = 0;
		for(Integer i = 0; i < 10; i++) {
			if(i == 0) {
				total = valuList.get(i);
			} else {
				total = total * valuList.get(i);
			}
		}
		System.out.println(total);
		int x = 0;
		int num = 0;
		long count = valuList.get(x);
		for(int i = 0; i < count - 1; i++) {
			for(int j = i + 1; j < count; j++) {
				num++;
				System.out.print(num + " {" + valuList[i] + ", " + valuList[j] + "}");
			}
		}
	}
}
