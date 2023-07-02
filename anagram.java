/* Two strings are said to be anagrams of each other if the second string is formed
 by rearranging characters of the first string
Example 1
Input: s = "listen" and t = "silent"

Output: true

Example 2
Input: s = "eleven plus two" and t = "twelve plus one"

Expected output: true

Example 3
Input: s = "rat" and t = "car"

Expected output: false
*/
import java.util.*;// complexity = O(nlogn)
class anagram {
    public static void main(String[] args) {
      String str1="hello world",str2="hello world";
      char []word1=str1.toCharArray();
      char []word2=str2.toCharArray();
      Arrays.sort(word1);
      Arrays.sort(word2);
      if(Arrays.equals(word1, word2))
         System.out.println("True");
         else
           System.out.println("False");
        
    }
}
/* Approach 2 (complexity O(n))
public class AnagramsByCounting {  
    static boolean areAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (countOccurrences(ch, s) != countOccurrences(ch, t)) {
                return false;
            }
        }

        return true;
    }

    static int countOccurrences(char c, String s) {
        return s.length() - s.replace(String.valueOf(c), "").length();
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent"));
        System.out.println(areAnagrams("eleven plus two", "twelve plus one"));
        System.out.println(areAnagrams("rat", "car"));
    }
}
*/