public class TrimZerosFromNum {

	public static void main(String[] args) {
		int num = 203000;
		int counter=0;
	while(num%10==0)
	{
		counter++;		
		num=num%10;
	}

}
}
