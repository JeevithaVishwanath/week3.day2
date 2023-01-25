package week3.day2;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String word="madam";
		String rev="";
		
		for (int i = word.length()-1; i >=0; i--) {

			rev = rev +word.charAt(i);
			
				}
		 
		
		if (word.equals(rev)) {
			
			System.out.println("This is Palindrome");
		}
		else {
			
			System.out.println("This is NOtPalindrome");
		}
		}
			
			
	}


