
public class CountCharRepeatedString {
	static void repeatedString(String s, int n) {
		//System.out.println("n:"+n);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(s);
        //long count=(long) 0.0;
        int count =0;
        for (int i = 0 ; i<n;)
        {
        	if( sb.length()< n)
            {
        		sb.append(s);
            }
        	
            i = sb.length();
        }
        //System.out.println(sb);
        sb1 = sb1.append(sb.subSequence(0, n));
        char c1= 'a';
        System.out.println(sb1);
        for(int i = 0 ;i<sb1.length(); i++)
        {
        	//System.out.println(sb1.charAt(i));
        		if(sb1.charAt(i)==c1)
        		count++;
        		//System.out.println(count);
        }
        System.out.println(count);


    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repeatedString("ababhas", 30);
	}

}
