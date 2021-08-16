package JavaInterfaceConcepts;

public interface Mother {

	
	 default void implementedMethod() {
	 System.out.println("implementedMethod() of interface Mother"); }
	 

	void unImplementedMethod();

}

interface Father {

	default void implementedMethod() {
		System.out.println("implementedMethod() of interface Father");
	}

	void unImplementedMethod();

}

/*
 * interface child extends Mother,Father {
 * 
 * 
 * @Override default void implementedMethod() { // TODO Auto-generated method
 * stub Father.super.implementedMethod(); }
 * 
 * 
 * }
 */

class concrete implements Father,Mother {

	
	  @Override public void unImplementedMethod() { // TODO Auto-generated methodstub
	  
	  
	  System.out.println("Implementing unImplementedMethod() from Class concrete");
	  
	  }
	 

	
	  @Override 
	  public void implementedMethod() { // TODO Auto-generated metho stub 
		  Mother.super.implementedMethod();
		  Father.super.implementedMethod(); 
	  }
	 
	public static void main(String[] args) {
		concrete c = new concrete();
		c.unImplementedMethod();
		c.implementedMethod();
//		c.super.implementedMethod();

	}
}