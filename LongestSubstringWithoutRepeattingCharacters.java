import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeattingCharacters {

    public  static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        // Iterate with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If character at right pointer is already in the set
            // move left pointer to the right and remove characters from the set
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(s.charAt(right));

            // Update the maxLength of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        /*HashMap<Character,Integer> hm = new HashMap<>();
        int start = 0, end = 1;
        int count = 1;
        hm.put(s.charAt(start), s.indexOf(s.charAt(start)));
        System.out.println(s.length());
        while(end < s.length())
        {
            System.out.println("insidee while   " + s.charAt(end)+ s.indexOf(s.charAt(end)));
            /*if (s.charAt(start)==s.charAt(end))
            {
                start = end+1;
                end = start+1;
            }
            //else if (s.charAt(start)!=s.charAt(end) && !hm.containsKey(s.charAt(end)))
            if (!hm.containsKey(s.charAt(end)))
            {
                System.out.println("inside first else if");
                hm.put(s.charAt(end), s.indexOf(s.charAt(end)));
                count++;
                end++;

            }
            else if (hm.containsKey(s.charAt(end)))
            {
                start =  hm.get(s.charAt(end))+1;
                hm.put(s.charAt(end), s.indexOf(s.charAt(end)));
                //sb.delete(start,sb.indexOf(s.charAt(end)));
                System.out.println("inside second else if");
            }
        }
        return count;*/
    }
    public static void main(String[] args) {
        String str= "abkcdcbdxe";
        System.out.println(lengthOfLongestSubstring(str));

    }


}
