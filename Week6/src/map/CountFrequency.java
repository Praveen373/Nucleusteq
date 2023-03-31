package map;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency{
    public static void main(String[] args) {
        String input = "1,1,2,2";
        //String input = "believe in yourself";
        Map<String, Integer> map = new HashMap<>();
        for(char c: input.toCharArray()) {
        	String s = Character.toString(c);
        	if(!map.containsKey(s)) {
        		map.put(s, 1);
        	}
        	else {
        		Integer value = map.get(s);
        		value= value+1;
        		map.put(s, value);

        	}
        }
        System.out.println(map);


    }
}
