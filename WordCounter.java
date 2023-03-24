import java.util.*;

public class WordCounter {
	public static void countWords(String[] words){    	
    	String[] countStr = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy",
    	"dog"}; int s=0;
    	
        TreeMap<String, Integer> count = new TreeMap<String, Integer>();
        
        for (String str : countStr) {
        	if (count.containsKey(str)) {
                count.put(str,count.get(str) + 1);
            } else {
                count.put(str, 1);
            } 
        }
       System.out.println(count);
    }
}