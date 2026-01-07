import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s= "abcabcbb";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = null;
        int start=0;
        int end=0;
        for (int i=0;i<s.length();i++)
        {
            if (!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
            }
        }
    }
}
