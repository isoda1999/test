package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

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
				System.out.print(num + " {" + valuList.get(i) + ", " + valuList.get(j) + "}");
			}
		}
	}

	public static void main2(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		boolean[] used = new boolean;
		        int[] param = new int[list.length];
		        create(list, param, used, 0);
		    }

	private static void create(int[] seed, int[] param, boolean[] used, int index) {
		if(index == param.length) {
			System.out.println(Arrays.toString(param));
			return;
		}

		for(int i = 0; i < seed.length; ++i) {
			if(used[i])
				continue;
			param[index] = seed[i];
			used[i] = true;
			create(seed, param, used, index + 1);
			used[i] = false;
		}
	}
}
