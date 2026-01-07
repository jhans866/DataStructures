import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    private static final int MAX_CACHE_SIZE = 5;

    // __define-ocg__: Using LinkedHashMap to maintain order of access
    private LinkedHashMap<Character, Boolean> cache = new LinkedHashMap<Character, Boolean>(MAX_CACHE_SIZE, 0.75f, true) {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Character, Boolean> eldest) {
            // Remove the eldest entry if the cache exceeds the maximum size
            return size() > MAX_CACHE_SIZE;
        }
    };

    public String processCache(String[] strArr) {
        // Process each character in the input array
        for (String s : strArr) {
            char beg = s.charAt(0); // Convert the string to a character
            System.out.println("beg: "+ beg);

            if (cache.containsKey(beg)) {
                // Access the character to update its position in the cache
                cache.get(beg);
            } else {
                // Add the new character to the cache
                cache.put(beg, true);
            }
        }

        // Build the result string from the cache
        StringBuilder result = new StringBuilder();
        for (Character c : cache.keySet()) {
            System.out.println("result.length() "+result.length());
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();
        String[] strArr = {"A", "B", "C", "D", "A", "E", "D", "Z"};
        System.out.println(lruCache.processCache(strArr)); // Output should be "C-A-E-D-Z"
    }
}