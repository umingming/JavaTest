package kr.co.aim.sprint1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AttributeHistory {
	
	public static void main(String[] args) {
		Map<String, String> condition = new HashMap<>();
		condition.put("A", "a");
		condition.put("B", "b");
		condition.put("C", "");
		
		Set<String> attrSet = condition.keySet();
		
		String str = String.join(", ", condition.keySet());
		
		System.out.println(condition.keySet().toString());
		System.out.println(str);
		
		String str2 = condition.entrySet().stream().map(e -> String.format("%s = '%s'", e.getKey(), e.getValue())).collect(Collectors.joining(" AND "));
		System.out.println(str2);
		
		String whereSql = condition.entrySet().stream()
				.filter(e -> !e.getValue().equals(""))
				.map(e -> String.format("%s = '%s'", e.getKey(), e.getValue()))
				.collect(Collectors.joining(" AND "));
		
		System.out.println(whereSql);
		
		
	}
	

}
