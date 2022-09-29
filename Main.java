package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> valuList = new ArrayList<>();
		for(Integer i = 0; i < 11; i++) {
			valuList.add(i * 10);
		}
		System.out.println(valuList);
		Integer a = valuList.get(1);
		Integer b = valuList.get(2);
		Integer c = valuList.get(3);
		Integer d = valuList.get(4);
		Integer e = valuList.get(5);
		Integer f = valuList.get(6);
		Integer g = valuList.get(7);
		Integer h = valuList.get(8);
		Integer i = valuList.get(9);
		Integer j = valuList.get(10);
		System.out.println(a * b * c * d * e * f * g * h * i * j);
	}
}
