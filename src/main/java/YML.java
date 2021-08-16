 class YML
{
    static String data = "";
    private YML()
    {
        data = "Y Media Labs";
    }
    
    public static YML getRef()
    {
    	YML yml = new YML();
    	return yml;
    }
   public static void printName(String data){
     System.out.println(data);
   }
}
 
 class Test
 {
     public static void main(String[] args)
     {
//         YML yml = new YML();
         System.out.println(YML.getRef().data);
     }
 }
