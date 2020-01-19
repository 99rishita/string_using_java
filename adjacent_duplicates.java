package types;
import java.util.*;
	
public class adjacent_duplicates {
	public String duplicate_removal(char[] chararray)
	{
		char prev = '\0';
		int k=0;
		for(int i=0; i<chararray.length; i++)
		{
			if(prev!=chararray[i])
			{
				chararray[k++] = chararray[i];
				prev = chararray[i];
			}
		}
		return new String(chararray).substring(0,k);		
	}
	

	public static void main(String[] args) {
		adjacent_duplicates ad = new adjacent_duplicates();
		String str = "abccaad";
		System.out.println("duplicate removal is " + ad.duplicate_removal(str.toCharArray()));

	}

}
