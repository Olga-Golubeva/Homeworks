package lv.olga.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions {
	
	public String question;
	public String [] options; 
	public int answer;
	
	public Questions(String q, String [] o, int a) {
		this.question = q;
		this.options = o;
		this.answer = a;
		
		
		
	}
}
