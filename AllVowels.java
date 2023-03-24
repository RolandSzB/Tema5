
public class AllVowels {

	public static boolean containsAllVowels(String str) {
		String  input = "The quick brown fox jumps over the lazy dog";
	    String[] vowels = {"a","e","i","o","u"};
	    int c=0;
	    for (int i = 0; i < 5; i++) {
	        if (input.contains(vowels[i])) c++;
	       if(c==5)  return true;
	           
	        
	}return false;
  }
}
