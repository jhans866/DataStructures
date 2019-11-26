public class StringPermutation { 
	  
    // Function to print all the permutations of str 
    static void printPermutn(String str, String ans) 
    { 
    	System.out.println("printPermutn: str "+ str + " ans "+ans + ";");
        // If string is empty 
        if (str.length() == 0) { 
            System.out.println("printing ans :" +ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
        	System.out.println("i :"+ i);
        	System.out.println("str: "+str);
            char ch = str.charAt(i); 
            System.out.println("ch " + ch);
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
            //System.out.println("str.substring(0, i):" +str.substring(0, i)	);
            System.out.println("ros "+ ros);
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String s = "abc"; 
        printPermutn(s, ""); 
    } 
} 