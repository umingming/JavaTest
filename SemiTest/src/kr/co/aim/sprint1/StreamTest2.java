package kr.co.aim.sprint1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StreamTest2 {
	
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		String[] groupList1 = { "A", "B", "C" };
		String[] groupList2 = { "A", "B" };
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유미");
			put("group", groupList1);
		}});
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유진");
			put("group", groupList2);
		}});
		
		List<Object> str = list.stream().map(i -> i.get("name"))
            			.collect(Collectors.toList());
		System.out.println(str.get(0));
		
		String prefix = "('";
		String infix = "', '";
		String postfix = "')";

		StringJoiner whereSql = new StringJoiner( "', '", "('", "')");
		for (Object i : str)
			whereSql.add(i.toString());

		System.out.println(whereSql.toString());
		System.out.println(list.get(0).get("name"));
		System.out.println(str.toString());
	}
}
