
public class Driver {

	public static void main(String[] args) {
		
		WashingMachine wm1 = new WashingMachine(1800, "LG");
		Toaster t1 = new Toaster(1000, "XX");
		

		System.out.println(wm1);
		System.out.println(t1);
		
		wm1.repair();
		
	}

}
