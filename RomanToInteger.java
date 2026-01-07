import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        // Map of Roman numerals to integers
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // To store the final result
        int n = s.length();

        // Iterate through the string
        for (int i = 0; i < n; i++) {
            // Get the value of the current Roman numeral
            int value = romanMap.get(s.charAt(i));

            // Check if the current numeral is smaller than the next one
            if (i < n - 1 && value < romanMap.get(s.charAt(i + 1))) {
                result -= value; // Subtract the value
            } else {
                result += value; // Add the value
            }
        }
        return result; // Return the final result
    }



    public static void main(String[] args) {

        RomanToInteger solution = new RomanToInteger();

        System.out.println(solution.romanToInt("XLII")); // 42
        System.out.println(solution.romanToInt("CXCIV")); // 194
        System.out.println(solution.romanToInt("MMMCDXLIV")); // 3444

    }
    }

