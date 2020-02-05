package lecture8.javalogic;

public class PrimeNumber {

	static boolean isPrime(int x) {
		x = 10; 
		for(int i = 2; i < x; i++)
			{
			    if(x % i == 0)
		            {
		                return false;
		            }
		        }
		        
		        return true;
	}
}
