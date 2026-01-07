
public class PrimeNumber{
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i*i <= n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 139;
		//boolean prime = isPrime(num);
		//System.out.println(prime);
		if(isPrime(num) )
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");

	}

}
