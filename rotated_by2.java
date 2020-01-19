package types;
import java.util.*;

public class rotated_by2 {
	
	String str2 = "azonam";
	int count=0;
	void rotated(String str1,int key)
	{
		String s=str1;	
		while(count<key)
			{	
				char c=s.charAt(0);
				String str = s.substring(1, s.length());
				s = str + c;
				System.out.println(s);
				count++;
			}
			if(s.equals(str2))
			{
				System.out.println("yes rotated");
			}
			else
			{
				System.out.println("not rotated");
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of rotations required");
		int key=sc.nextInt();
		rotated_by2 rb = new rotated_by2();
		rb.rotated("amazon", 2);

	}

}
