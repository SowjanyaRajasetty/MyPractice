//Given two integer arrays, check if any number repeats in both arrays.
public class Match {
	
	
	public static void main(String[] args) {
		
		boolean flag = false;
		int arr1[] = {1,3, 5, 7, 10};
		int arr2[] = {2, 5, 9, 12, 22, 45};
		
		for(int a1:arr1)
		{
			for(int a2:arr2)
			{
				if(a2==a1)
				{
					flag=true;
					break;
				}
				else
				{
					flag=false;
					continue;
				}
			}
			if(flag)
			{
				break;
			}
		}
		if(flag)
		{
			System.out.println("It has a match");
		}
		else
		{
			System.out.println("No Match");
		}
	}

}
