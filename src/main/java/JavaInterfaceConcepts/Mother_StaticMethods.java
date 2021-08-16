package JavaInterfaceConcepts;

public interface Mother_StaticMethods {

	 static void cleanVehicle(){
	        System.out.println("I am cleaning vehicle");
	    }

}

class Car implements Mother_StaticMethods {
    
//    @Override
    public static void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.cleanVehicle();

    }
}

