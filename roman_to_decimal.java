package types;

public class roman_to_decimal {
	
		int value(char s)
		{
			 if(s=='I')
				{
					return 1;
				}
				if(s=='V')
				{
					return 5;
				}
				if(s=='X')
				{
					return 10;
				}
				if(s=='L')
				{
					return 50;
				}
				if(s=='C')
				{
					return 100;
				}
				if (s == 'C')
				{
		            return 100;
				}
		        if (s == 'D')
		        {
		            return 500;
		        }
		        if (s == 'M')
		        {
		        	return 1000;
		        }
				return -1;
		}
		int compare(String str)
		{
			int res=0;
			for(int i=0; i<str.length(); i++)
		    {
		    	int m = value(str.charAt(i));
		    	int k=0;
		    	
		    	
		    	if((i+1)<str.length())
		    	{
		    		k = value(str.charAt(i+1));
		    		if(m>=k)
			    	{
			    		res = res + m;
			    	}
			    	else
			    	{
			    		res = res + k - m;
			    		i++;
			    	}
		    	}
		    	else
		    	{
		    		res=res+m;
		    		//i++;
		    	}
		    }
		    return res;
		}

	public static void main(String[] args) {
		roman_to_decimal rtd = new roman_to_decimal();
		
		System.out.println("the conversion is " + rtd.compare("MCMIV"));

	}

}
