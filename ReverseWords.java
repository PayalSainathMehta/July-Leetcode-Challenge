import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class ReverseWords {
	
		public String reverseWords(String s) {
			 //two pointers one starting one ending
			int left = 0, right = s.length() -  1;
			//get rid of leading and trailing spaces
			while(left <= right && s.charAt(left) == ' ') ++left;
		    while(left <= right && s.charAt(right) == ' ') --right;
			Deque<String> q = new ArrayDeque<String>();
			StringBuilder word = new StringBuilder();
			//now append to sb if char exists and if char is space and the sb is not empty then transfer it to the queue
			
			while(left <= right) {
				char c = s.charAt(left);
				if(c == ' ' && word.length() != 0) {
					q.offerFirst(word.toString());
					word.setLength(0);
				}
				else if( c != ' ')
					word.append(c);
				++left;
			}
			
			q.offerFirst(word.toString());
			return String.join(" ", q);
		}
		
		
		
	 	public String reverseWordsWithBuiltin(String s) {
	 		s = s.trim();
	 		List<String> wordList = Arrays.asList(s.split("\\s+"));
	 		Collections.reverse(wordList);
	 		return String.join(" ", wordList);
	 		
	    }
	 	
		public static void main(String[] args) {
			String input = "the sky is blue";
			ReverseWords obj = new ReverseWords();
			System.out.println(obj.reverseWordsWithBuiltin(input));
			System.out.println(obj.reverseWords(input));	
		}

		
}
