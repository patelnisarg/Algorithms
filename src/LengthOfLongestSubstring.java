import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static int lenOfLongestSubstring(String s){
        Set<Character> output = new HashSet<>();    //set to add the unqiue characters in the string
        int count = 0;  // count to keep track of the length
        int i = 0, j = 0;
        while(i < s.length() && j < s.length()){
            char ch = s.charAt(j);
            if (!output.contains(ch)){
                output.add(ch);
                j++;
                count = Math.max(count, j-i);
            }
            else{
                output.remove(ch);
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.print(lenOfLongestSubstring(s));
    }
}
