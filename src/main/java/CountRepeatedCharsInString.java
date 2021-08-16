import java.util.HashMap;

public class CountRepeatedCharsInString {
	
	public void findDuplicates(String s)
	{
		char[] c=s.toCharArray();
		HashMap<Character,Integer> M=new HashMap<Character,Integer>();
		for(char c1:c)
		{
			if(M.containsKey(c1))
			{
				M.put(c1, M.get(c1)+1);
			}
			else
			{
				M.put(c1, 1);
				
			}
		}
		System.out.println(M.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountRepeatedCharsInString d=new CountRepeatedCharsInString();
		d.findDuplicates("SowjanyaR");
	}


}
