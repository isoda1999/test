package kase;

import java.util.ArrayList;
import java.util.Arrays;

public class Point {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 20, 30, 10));
		System.out.println(list);
		/*long total = 0;
		for (Integer i = 0; i < list.size(); i++) {
			if (i == 0) {
				total = list.get(i);
			} else {
				total = total * list.get(i);
			}
		}
		System.out.println(total);
		
		//組み合わせ
		int num = 0;
		long count = list.size();
		for (int i = 0; i < count ; i++) {
			for (int j = i + 1; j < count; j++) {
				num++;
				System.out.println(num + " {" + list.get(i) + ", " + list.get(j) + "}");
			}
		}
		
		//順列
		num = 0;
		count = list.size();
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				for (int k = 0; k < count; k++) {
					//3つの要素が違う数でなくてはいけない
					if (i != j && i != k && j != k) {
						num++;
						System.out.println(num + " {" + list.get(i) + "," + list.get(j) + "," + list.get(k) + "}");
					}
				}
			}
		}*/
		//全部の組み合わせの中から同じ組み合わせだけを表示する
		int num = 0;
		long count = list.size();
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				int x = list.get(i);
				int y = list.get(j);
				if (x == y) {
					num++;
					System.out.println(num + " {" + x + ", " + y + "}");
				}
			}
		}
	}
}
