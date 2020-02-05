
public class ForLoopIfElse {

	public static void main(String[] args) {
		
//		You have an array with number {3, 1, 2, 4}.
//		Using a loop and (if, else if, else bock) find a number in the array and print this
//		number name on console. 
//		Be creative you can you different options to archive results.
		
		int[] myNum = {2, 1, 4, 3};
		int findNumber = 3;
		for(int i = 0; i < myNum.length; i++) {
			if(myNum[i] == findNumber) {
			System.out.println("THREE");}
			
			else if(myNum[i] > findNumber) {
				System.out.println(" ");
			}
			else{
				System.out.println(" ");}
			
		}
	}
}


