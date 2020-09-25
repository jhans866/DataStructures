import java.util.Arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2, 4, 5,6,7,8};
        int len = arr1.length;
         System.out.println(len);
        int sumofNnumnbers = ((len+1)*(len+2))/2;
        int sumofNumbers = Arrays.stream(arr1).sum();
        int missingnumber = sumofNnumnbers- sumofNumbers;
        System.out.println(sumofNnumnbers);
        System.out.println(sumofNumbers);
        System.out.println(missingnumber);


    }
}
