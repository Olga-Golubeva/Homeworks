package lecture8.javalogic;

public class JavaLogic {

	public static boolean cigarParty(int cigars, boolean isWeekend, boolean isNotWeekend) {
		  if(cigars > 60 && isWeekend){
		    return true;
		    
		  }else if(cigars > 40 && cigars <=60 && isNotWeekend){
		    return true;
		  }else{
		    return false;
		  }
		  
		}

	
	public static void main(String[] args) {
		System.out.println(cigarParty(80, true, false));
		

	}

}
