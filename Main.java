package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> valuList = new ArrayList<>();
		for(Integer i = 0; i < 11; i++) {
			valuList.add(i * 10);
		}

		Integer a = valuList.get(0);
		Integer b = valuList.get(1);
		Integer c = valuList.get(2);
		Integer d = valuList.get(3);
		Integer e = valuList.get(4);
		Integer f = valuList.get(5);
		Integer g = valuList.get(6);
		Integer h = valuList.get(7);

		System.out.println(valuList);
	}
}
