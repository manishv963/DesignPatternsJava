 class Singleton{
		
		public static Singleton  ss ;   //lazy  ininitalizition
		//public static Singleton  ss  = new Singleton();  //eager initialization
		
		private Singleton() {
			
			
		}
		public synchronized static Singleton getInstance() {
		if(ss == null) {
			ss= new Singleton();
			return ss;
		}
		else 
			return ss;
	}
}

public class SingletonDesignPattern {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton  ss = Singleton.getInstance();
		System.out.println(ss);
		Singleton  ss1 = Singleton.getInstance();
		System.out.println(ss1);
		//both the address are same
	}

}
