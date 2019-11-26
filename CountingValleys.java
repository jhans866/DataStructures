
public class CountingValleys {
	public static void countSteps(int n, String s1)
	{
		int count = 0, total = 0;
		char c1 = 'U';
		char c2 = 'D';
		for (int i = 0 ; i<n; i++)
		{
			if(s1.charAt(i)==c1)
			{
				count++;
				System.out.println("count at U:" + count);
			}
			else if (s1.charAt(i)==c2)
			{
				count--;
				System.out.println("count at D:" + count);
				if (count == -1) {
                    total++;
                }
			}
		}
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "UDDDUDUUDDU";
		countSteps(str.length(), str);

	}

}
