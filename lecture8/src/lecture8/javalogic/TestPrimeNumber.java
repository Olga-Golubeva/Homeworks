package lecture8.javalogic;

public class TestPrimeNumber {

	public static void main(String[] args) {
		
		
		
		for(int i = 1; i <=500; i++) {
			if(isPrime(i)) {
			
				System.out.print(i + " ");
				}
		}
	}
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

