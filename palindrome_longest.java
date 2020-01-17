package types;
import java.util.*;

public class palindrome_longest {
	
	public String longest_palindrome(String str)
	{
		String longestpalindrome = str.substring(0,1);
		for(int i=0; i<str.length(); i++)
		{
			String newpalindrome = check_equal(str,i,i);
			if(newpalindrome.length()>longestpalindrome.length())
			{
				longestpalindrome = newpalindrome;
			}
			
			newpalindrome = check_equal(str,i,i+1);
			if(newpalindrome.length()>longestpalindrome.length())
			{
				longestpalindrome = newpalindrome;
			}
		}
		return longestpalindrome;
		}
		
		public String check_equal(String str, int begin, int end)
		{
			while((begin>=0 && end<=str.length()-1) && (str.charAt(begin)==str.charAt(end)))
			{
				begin--;
				end++;
			}
			return str.substring(begin+1, end);
		}


	public static void main(String[] args) {
		palindrome_longest pl = new palindrome_longest();
		String str="cabbaca";
		System.out.println("longest palindrome is " + pl.longest_palindrome(str));
		System.out.println("longest palindrome is " + pl.longest_palindrome("2519889137"));

	}

}
