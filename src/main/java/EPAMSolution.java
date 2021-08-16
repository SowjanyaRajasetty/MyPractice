

public class EPAMSolution {
	
public static boolean solution(int[] A) {
	boolean flag=false;	 
	int S[]=  {0,0,7} ; 
	int[] A1= {1,0,4,7,9,0}; 
	 int len=S.length;
	 int j=0;
	 int cursor = 0;
	 for(int i=0;i<len;i++)
	 {
//		 for(int j=0;j<A1.length;j++)
		 
		 while(j<A1.length)
		 {
			 cursor=i;
			 if(S[i]==A1[j])
			 {
				 flag=true;
				 j++;
				 break;
			 }
			 else
			 {
				 flag=false;
				 j++;
				 continue;
			 }
		 }
		 
	 }
	if(flag==true && cursor==len-1)
	return true;
	else
		return false;

	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] A= {1,2,4,0,0,7};
boolean b=solution(A);
System.out.println(b);

	}

}
