

public class StaticNonStaticVar {
	int i;
	static int j=10;
	public void m1()
	{
		i=10+i;
		j=j+1;
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticVar s=new StaticNonStaticVar();
		s.m1();
		s=new StaticNonStaticVar();
		s.m1();
		
		
	}

}
