import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak2 {
	
	Map<String, List<String>> map = new HashMap<>();
	
	public List<String> wordBreak(String s, List<String> wordDict){
		List<String> res = new ArrayList<String>();
		/*
		 * BASE CASES
		 * 1. empty string - return empty list
		 * 2. map has the string stored, return the value
		 * 3. dict has it, add to list
		 */
		if(s.length() == 0 || s == null)
			return res;
		if(map.containsKey(s))
			return map.get(s);
		if(wordDict.contains(s))
			res.add(s);
		for(int i = 1; i < s.length(); i++) {
			String t = s.substring(i);// beginning index for string so i to everything
			if(wordDict.contains(t)) { // check if it has it
				List<String> temp = wordBreak(s.substring(0, i), wordDict);
				for(int j = 0; j < temp.size(); j++)
					res.add(temp.get(j) + " " + t);
			}
		}
		map.put(s, res);
		return res;
	}
	
	
	public static void main(String[] args) {
		String s = "catsanddog";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("cat");
		wordDict.add("cats");
		wordDict.add("and");
		wordDict.add("sand");
		wordDict.add("dog");
		WordBreak2 obj = new WordBreak2();
		System.out.println(obj.wordBreak(s, wordDict).toString());
	}
}
