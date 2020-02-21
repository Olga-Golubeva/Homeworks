package lv.olga.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions {
	
	public String question;
	public String [] options; 
	public int answer = 1;
	public String tip;
	
	public Questions(String q, String [] o, int a, String t) {
		this.question = q;
		this.options = o;
		this.answer = a;
		this.tip = t;
		
//		String regex = "^([1-4])";
//		String data = Integer.toString(answer);
		
		
		
	}
}
