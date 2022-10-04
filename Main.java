package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	//組み合わせ
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(list);
		long total = 0;
		{
			for(Integer i = 0; i < 2; i++) {
				if(i == 0) {
					total = list.get(i);
				} else {
					total = total * list.get(i);
				}
			}
			System.out.println(total);
			int x = 0;
			int num = 0;
			long count = list.get(x);
			for(int j = 0; j < count - 1; j++) {
				for(int j1 = j + 1; j1 < count; j1++) {
					num++;
					System.out.print(num + " {" + list.get(j) + ", " + list.get(j1) + "}");
				}
			}
		}
	}

}
