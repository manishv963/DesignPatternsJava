import java.util.*;

class Vhicle implements Cloneable{
	
	public List vehicleList =  new ArrayList();
	
	public Vhicle() {
	
	}
	public Vhicle(List a) {
		this.vehicleList = a;
	}
	public void insertData() {
		this.vehicleList.add("a");
		this.vehicleList.add("b");
	}
	public Object clone() {
		List tempList = this.vehicleList;
		return new Vhicle(tempList);
		
	}
}

 
public class ProtoTypeDesignPattern {

	
	public static void main(String[] args) {
		Vhicle v1 = new Vhicle();
	v1.insertData();
	System.out.println(v1.vehicleList);
	Vhicle v2 = (Vhicle) v1.clone();
	v2.vehicleList.remove(0);
	System.out.println(v2.vehicleList);
	
	}
	
	

}
