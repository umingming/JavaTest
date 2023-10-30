package kr.co.aim.sprint1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {
	
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<>();
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유미");
			put("age", 29);
			put("city", "서울");
		}});
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유진");
			put("age", 30);
			put("city", "서울");
		}});
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유진");
			put("age", 20);
			put("city", "서울");
		}});
		
		list.add(new HashMap<String, Object>(){{
			put("name", "유진");
			put("age", 25);
			put("city", "서울");
		}});
		
		list.add(new HashMap<String, Object>(){{
			put("name", "은지");
			put("age", 30);
			put("city", "서울");
		}});
		
		String str = list.stream()
				.collect(Collectors.groupingBy((i -> i.get("name"))),
						(Collectors.groupingBy(i -> i.get("age"))))
				.entrySet().stream()
                .collect(Collectors.toList())
				.toString();
		
		System.out.println(str);
	}
}
