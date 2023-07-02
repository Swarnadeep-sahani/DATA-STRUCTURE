//Reverse Words in a String- eg: Input: "Hello Koding"  Output: "Koding Hello"
//In Java, the trim() method is used to remove whitespace from both the beginning and end of a string.

public class ReverseWordsBySplittingAndIterative {  
    static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello  Koding"));
        System.out.println(reverseWords(" Live on time, emit no evil "));
    }
}
