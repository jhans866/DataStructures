import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountMatchingPairsInArray {
	public static int numberPairs(int n, int[] ar) {
        int pairs = 0;
        int key, value, rem =0 ;
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i<n; i++)
        { 
            Integer j = map.get(ar[i]);
            map.put(ar[i], (j == null) ? 1 : j + 1); 
        }
        for (Map.Entry<Integer, Integer> val : map.entrySet()) { 
            System.out.println("Element " + val.getKey() + " "
                              + "occurs"
                              + ": " + val.getValue() + " times"); 
           key = val.getKey() ;
           value = val.getValue();
           rem = value / 2;
           //if(rem %2 == 0)
           pairs = pairs + rem;
        }
        return pairs;
    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20 ,20, 10, 10, 30, 50, 10, 20};
		int pairs1 = numberPairs(9, arr);
		System.out.println(pairs1);

	}

}
