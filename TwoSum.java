import java.util.HashMap;

public class TwoSum {

  public static void main(String args[])
  {
    int [] arr = {2,7,11,15};
    int[] arr1= new int[]{};
    int target = 17, number= 0;
    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
    for (int i = 0; i < arr.length; i++)
    {
      number = target - arr[i];
      if(map.containsKey(number)){
        arr1 = new int[] { map.get(number), i};
      }
      else
      {
        map.put(arr[i],i);
      }

    }
    for (int i = 0; i < arr1.length; i++)
    {
      System.out.println(arr1[i]);
    }

  }

}
