package task3;

import java.util.ArrayList;
import java.util.List;

public class SampleList {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		
		ls.add("トリニダード");
		ls.add("ダーツライブ");
		ls.add("フェニックス");
		
		try {
		System.out.println(ls.get(0));
		System.out.println(ls.get(2));
		System.out.println(ls.get(3));
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("何らかの例外が発生したよ！残念！！");
		}
	}
}