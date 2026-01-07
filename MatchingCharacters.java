import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class MatchingCharacters {

    public static int MatchingCharacters(String str) {
        // __define-ocg__: Map to store the first and last occurrence of each character
        Map<Character, int[]> positions = new HashMap<>();

        // Iterate through the string to record the first and last occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            char beg = str.charAt(i);
            if (!positions.containsKey(beg)) {
                System.out.println("position:" + i);
                positions.put(beg, new int[] {i, i});
            } else {
                positions.get(beg)[1] = i; // Update the last occurrence
            }
        }
        int maxUniqueCount = 0;

        // Calculate the number of unique characters between pairs of matching letters
        for (Map.Entry<Character, int[]> entry : positions.entrySet()) {
            int[] pos = entry.getValue();
            System.out.println("pos[0]: "+pos[0] +"  pos[1]: "+pos[1]);
            maxUniqueCount = Math.max(maxUniqueCount, pos[1]-1-pos[0]);
            /*int[] pos = entry.getValue();
            System.out.println("pos[0]: "+pos[0] +"  pos[1]: "+pos[1]);
            if (pos[0] != pos[1]) { // Ensure there is more than one occurrence
                Set<Character> uniqueChars = new HashSet<>();
                for (int i = pos[0] + 1; i < pos[1]; i++) {
                    uniqueChars.add(str.charAt(i));
                }
                maxUniqueCount = Math.max(maxUniqueCount, uniqueChars.size());
            }*/
        }

        return maxUniqueCount;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(MatchingCharacters("ahyjakhbk")); // Output should be 4
        //System.out.println(MatchingCharacters("ghececgkaem")); // Output should be 5
        //System.out.println(MatchingCharacters("mmmerme")); // Output should be 3
       // System.out.println(MatchingCharacters("abccdefghi")); // Output should be 0
    }
}