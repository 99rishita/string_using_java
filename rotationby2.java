package types;

public class rotationby2 {
	static boolean rotate_by2(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		String left_shift = "";
		String right_shift = "";
		int len=str2.length();
		
		left_shift = left_shift + str2.substring(len-2,len) + str2.substring(0,len-2);
		System.out.println(left_shift);
		
		right_shift = right_shift + str2.substring(2) + str2.substring(0,2);
		System.out.println(right_shift);
		
		return (str1.equals(left_shift) || str1.equals(right_shift));
	}

	public static void main(String[] args) {
		rotationby2 br = new rotationby2();
		System.out.println(rotate_by2("onamaz" , "azonam" )? "yes" : "No");

	}

}
