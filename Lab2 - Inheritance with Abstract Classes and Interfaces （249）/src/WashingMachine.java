
public class WashingMachine extends Appliance implements Repairable {
	
	public WashingMachine(int power, String brand) {
		this.power = power;
		this.brand = brand;
	}
	
	public void repair() {
		System.out.println("The WashingMachine is being repaired.");	
		
	}
	
	@Override
	public String toString() {
		return "This is a WashingMachine. Power = " + power + "; Brand = " + brand + ".";
	}
	

}
