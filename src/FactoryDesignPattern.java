 class Vehicle{
		
	 	public int wheel;

		@Override
		public String toString() {
			return "Vehicle [wheel=" + wheel + "]";
		}
	 	
}

 
 class Car extends Vehicle{
	 Car(int wheel){
		 this.wheel = wheel;
	 }
	 
 }

 class Bike extends Vehicle{
	 Bike(int wheel){
		 this.wheel = wheel;
	 }
	 
 }
 
 class VehicleFactory{
	 public static Vehicle getVehicleInstance(int wheel,String vehicleType) {
		 Vehicle v = new Vehicle();
		 
		 if(wheel== 4 && vehicleType.equals("car"))
			 v = new Car(4);
		 else if(wheel== 2 && vehicleType.equals("bike"))
			 v = new Bike(2);
		  
		 return v;
	 }
 }
 
public class FactoryDesignPattern {

	
	public static void main(String[] args) {
	
	Vehicle v = VehicleFactory.getVehicleInstance(2, "bike");
	System.out.println(v);

	Vehicle v2 = VehicleFactory.getVehicleInstance(4, "car");
	System.out.println(v2);
	}

}
