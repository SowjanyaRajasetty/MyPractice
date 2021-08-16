package Programs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public void resultRegistration(List<String> regList,String stateCode)
	{
		
		regList.forEach(regCode->
		{
			String[] code=regCode.split(" ");
			
	
			if(code[0].contains(stateCode))
			{
				System.out.println(regCode);
			}
			
		});
		
		
	}
	public void resultRegistration(List<String> regList,String stateCode,String regCode)
	{
		regList.forEach(regCode1->
		{
			String[] code=regCode.split(" ");
			if(code[0].contains(stateCode)&&code[1].contains(regCode));
			{
				System.out.println(regCode1);
			}
			
		});
		
	}
	

	public static void main(String[] args) {
		Solution s1=new Solution();
		List<String> RegList=new ArrayList<String>();
		RegList.add("KA 02 MN 1234");
		RegList.add("KA 04 JD 1234");
		RegList.add("KA 05 LS 1232");
		RegList.add("MH 04 KA 1232");
		RegList.add("AP 01 AA 1212");
		
		s1.resultRegistration(RegList,"KA");
		s1.resultRegistration(RegList,"KA","02");
		

		
	}

}
