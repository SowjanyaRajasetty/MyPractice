

public class StringReverse {
	static String s2 = "";
	
	public static String reverse()
	{
		String s1="Sowjanya R";

				char[] c=s1.toCharArray();
				

				for(int i=s1.length()-1;i>=0;i--)
				{
				s2=s2+c[i];
				}
		return s2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse());
	}

}
