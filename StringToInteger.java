public class StringToInteger {
    public static void main(String[] args) {
        String s1 = "0   04fe2";
        int val=0;
        String s2 = s1.toLowerCase().trim().replaceAll("[^\\d-]","");
        /*if(s2.toLowerCase().substring(0).matches("[a-z]"))
        {
            val = 0;
        }*/
        if (s2.charAt(0)=='0' )
        {
            val = 0;
        }
        else {
            val = Integer.parseInt(s2);
        }

        System.out.println(val);
    }
}
