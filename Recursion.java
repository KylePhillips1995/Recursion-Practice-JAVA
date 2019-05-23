import java.util.Stack;

public class Recursion {


	public static void emptyStack(Stack s) {
		
		if(!s.isEmpty()) {
			System.out.println(s.pop());
			emptyStack(s);
		}
	}
	
	public static void printFIFO(Stack s) {
		
		String  str = "";
		if (!s.isEmpty()) {
			
			str = (String)s.pop();
			printFIFO(s);
		}
		System.out.println(str);
		}
	
	
	
	palindrome2(String word, int i, int j){
	
		if(i < j) {
			if(word.charAt(i) != word.charAt(j)) {
				
				return false;
			}
			
			else {
				i++;
				j--;
				return palindrome2(word, i, j);
			}
		}
			else { return true;}
			
			
			}
	
	
	boolean palindrome3(String word, int j, int i) {
		
		if(i<j) {
			if(word.substring(i,i+1).toLowerCase().equals(word.substring(j-1, j).toLowerCase()))
			{ return palindrome3(word, i+1, j-1);}
			

		else {return false;}
		}
		else {return true;}
	}
		

			
	
	}
	
	
	

