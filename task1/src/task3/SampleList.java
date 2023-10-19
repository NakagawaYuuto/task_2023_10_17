package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		System.out.println("ダーツ部品の名前の一覧を表示します。");
		Map<String, String> parts = new HashMap<>();
		
		parts.put("1", "フライト");
		parts.put("2", "シャフト");
		parts.put("３", "バレル");
		parts.put("４", "チップ");
		
		//キーのみ取り出す
		int dartparts = 0;
		for(String dart : parts.keySet()) {
			dartparts = dartparts + 1;
			//dartparts =  dartparts++;
		}
		System.out.println("ダーツの部品の総数は、" + dartparts + "点です");
		//情報のみ取り出す
		for(String dart : parts.values()) {
			System.out.println(dart);
		}
		
		System.out.println("以上、ダーツの部品紹介でした。");
		
		
		
	}
}